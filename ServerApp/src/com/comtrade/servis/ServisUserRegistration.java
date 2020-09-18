package com.comtrade.servis;

import com.comtrade.broker.Broker;
import com.comtrade.domen.SqlException;
import com.comtrade.domen.TransferObject;
import com.comtrade.domen.User;

public class ServisUserRegistration extends GeneralSystemOperation {

	@Override
	public void executeConcreteSystemOperation(TransferObject transferObject) {
		User user = (User) transferObject.getRequest();
		Broker broker = new Broker();
		
		try {
			broker.insert(user);
			transferObject.setMessage("Registration successful ");
		} catch (SqlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
