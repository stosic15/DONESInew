package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HomeAdress implements GeneralDomen {
	private int id;
	private String adress;
	public HomeAdress() {
		super();
	}
	public HomeAdress(String adress) {
		super();
		this.adress = adress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String getTableName() {
		
		return " home_adress ";
	}
	@Override
	public String getCollumnName() {
		
		return " (adress) ";
	}
	@Override
	public String getValues() {
		
		return " (?) ";
	}
	@Override
	public void setValuesINSERT(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, adress);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<GeneralDomen> selectAll(ResultSet resultSet) {
		List<GeneralDomen>adresses = new ArrayList<GeneralDomen>();
		try {
			while(resultSet.next()){
				HomeAdress adress = new HomeAdress(resultSet.getString("adress"));
				adresses.add(adress);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adresses;
	}
	@Override
	public List<GeneralDomen> selectDistinct(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getDistinctValues() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String setUpdate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String returnId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setUpdate(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		
	}
	

}
