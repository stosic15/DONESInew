package com.comtrade.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
	private Connection  connection;
	private volatile static Connections connections;
	private Connections() {
		
	}
	public Connection getConnection() {
		return connection;
	}
	public static Connections getInstance() {
		if(connections == null) {
			synchronized (Connections.class) {
				if(connections == null) {
					connections = new Connections();
				}
				
			}
			
		}
		return connections;
	}
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void undoTransaction() {
		try {
			connection.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void confirmTansaction() {
		try {
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void startTransaction() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/avio_kompanija_grupa_a", "root","");
			connection.setAutoCommit(false);
			connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
