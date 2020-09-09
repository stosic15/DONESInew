package com.comtrade.servis;

import com.comtrade.broker.Broker;
import com.comtrade.domen.HomeAdress;
import com.comtrade.domen.SqlException;
import com.comtrade.domen.TransferObject;

public class ServisHomeAdressGET_ALL extends GeneralSystemOperation {

	@Override
	public void executeConcreteSystemOperation(TransferObject transferObject) {
		Broker b = new Broker();
		
		try {
			transferObject.setResponse(b.selectAll(new HomeAdress()));
		} catch (SqlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
