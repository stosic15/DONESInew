package com.comtrade.domen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class City implements GeneralDomen {
	private int id;
	private String name;
	public City() {
		super();
	}
		
    int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public List<GeneralDomen> selectAll(ResultSet resultSet) {
		List<GeneralDomen >citys = new ArrayList<GeneralDomen>();
		try {
			while(resultSet.next()) {
			City city = new City();
			city.setId(resultSet.getInt("id_city"));
			city.setName(resultSet.getString("city_name"));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return citys;
		
	}
	@Override
	public String getCollumnName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getValues() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setValuesINSERT(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
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
	
	
	


