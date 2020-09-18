package com.comtrade.broker;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.comtrade.connections.Connections;
import com.comtrade.domen.GeneralDomen;
import com.comtrade.domen.SqlException;



public class Broker {
	public void insert(GeneralDomen generalDomen) throws SqlException {
		String sql = "insert into "+generalDomen.getTableName()+" "+generalDomen.getCollumnName()+" values "+generalDomen.getValues();
		
		try {
			PreparedStatement preparedStatement = Connections.getInstance().getConnection().prepareStatement(sql);
			generalDomen.setValuesINSERT(preparedStatement);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SqlException("Insert problem"+ e);
		}
		}
		public List<GeneralDomen>selectAll(GeneralDomen generalDomen) throws SqlException{
			String sql = "select * from "+generalDomen.getTableName();
			ResultSet resultSet = null;
			try {
				PreparedStatement preparedStatement = Connections.getInstance().getConnection().prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
			} catch (SQLException e) {
				throw new SqlException(e.toString());
				
			}
			return generalDomen.selectAll(resultSet);
		
	/*}	
		/*public void selectDistinct(GeneralDomen generalDomen){
			//Select from user where email = ? or username = ? and password = ?
			String sql = " select from "+generalDomen.getTableName()+" where "+generalDomen.getCollumnName()+" or "+generalDomen.getCollumnName()+" "
			
			ResultSet resultSet = null;
				
				try {
					PreparedStatement	preparedStatement = Connections.getInstance().getConnection().prepareStatement(sql);
					resultSet = preparedStatement.executeQuery();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
							
		}
		public void update(GeneralDomen generalDomen) {                                                               
			String sql = " update "+generalDomen.getTableName()+" set "+ generalDomen.setUpdate()+ " where "+generalDomen.returnId()+" = 1 ";
			//String sql = "update user set mobile_number = 0675698741  where id_user = 1"  ;

			try {
				PreparedStatement preparedStatement = Connections.getInstance().getConnection().prepareStatement(sql);
				//generalDomen.setUpdate(preparedStatement);
				preparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
			//UPDATE EMPLOYEES SET SALARY = ? WHERE ID = ?"
		   
		}
		




