package com.comtrade.domen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Restaurant implements GeneralDomen{
	private int id;
	private String name;
	public Restaurant() {
		super();
	}
	public Restaurant(String name) {
		super();
		this.name = name;
	}
	public int getId() {
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
	public String getTableName() {
		// TODO Auto-generated method stub
		return " restaurant ";
	}
	@Override
	public String getCollumnName() {
		// TODO Auto-generated method stub
		return " (restaurant_name) ";
	}
	@Override
	public String getValues() {
		// TODO Auto-generated method stub
		return " (?) ";
	}
	@Override
	public void setValuesINSERT(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<GeneralDomen> selectAll(ResultSet resultSet) {
		List<GeneralDomen>restaurants = new ArrayList<GeneralDomen>();
		try {
			while(resultSet.next()) {
				Restaurant restaurant = new Restaurant();
				restaurant.setId(resultSet.getInt("id_restaurant"));
				restaurant.setName(resultSet.getString(" restaurant_name "));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return restaurants;
	}
	
	

}
