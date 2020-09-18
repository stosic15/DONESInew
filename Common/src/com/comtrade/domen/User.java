package com.comtrade.domen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class User implements GeneralDomen{
	/**
	 * 
	 */
	
	private int id_user;
	private String email;
	private String password;
	private String user_name;
	private String name;
	private String last_name;
	private String mobile_number;
	public User() {
		super();
	}
	public User(String email, String password, String user_name) {
		super();
		this.email = email;
		this.password = password;
		this.user_name = user_name;
		
		
	}
	public User(String email, String user_name, String name, String last_name, String mobile_number) {
		super();
		this.email = email;
		this.user_name = user_name;
		this.name = name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		
		
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "user";
	}
	@Override
	public String getCollumnName() {
		// TODO Auto-generated method stub
		return " ( email , password , user_name ,mobile_number,name, last_name  ) ";
	}
	@Override
	public String getValues() {
		// TODO Auto-generated method stub
		return "(?, ?, ?,?,?,?)";
	}
	@Override
	public void setValuesINSERT(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, user_name);
			preparedStatement.setString(4, "");
			preparedStatement.setString(5, "");
			preparedStatement.setString(6, "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public List<GeneralDomen> selectAll(ResultSet resultSet) {
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
		return null;
		
		
	}
	@Override
	public String setUpdate() {
		return  " user_name = " +user_name+ ", mobile_number = " +mobile_number+ ", name =" +name+ ", last_name = " +last_name;
	}
	@Override
	public String returnId() {
		// TODO Auto-generated method stub
		return "id_user";
	}
	@Override
	public void setUpdate(PreparedStatement preparedStatement) {
		try {
			 
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password );
			preparedStatement.setString(3, user_name);
			preparedStatement.setString(4, mobile_number);
			preparedStatement.setString(5, name);
			preparedStatement.setString(6, last_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
