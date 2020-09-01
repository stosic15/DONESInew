package com.comtrade.broker;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.comtrade.connections.Connections;
import com.comtrade.domen.GeneralDomen;
import com.comtrade.domen.SqlException;

public class Broker {
	public void insert(GeneralDomen generalDomen) throws SqlException {
		String sql = "insert into "+generalDomen.getTableName()+" "+generalDomen.getCollumnName()+" values"+generalDomen.getValues();
		
		try {
			PreparedStatement preparedStatement = Connections.getInstance().getConnection().prepareStatement(sql);
			generalDomen.setValuesINSERT(preparedStatement);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SqlException("Insert problem"+ e);
		}
		
	}	

}
