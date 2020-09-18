package com.comtrade.servis;

import com.comtrade.broker.Broker;
import com.comtrade.domen.TransferObject;
import com.comtrade.domen.User;

public class ServisUserDataUpdate extends GeneralSystemOperation {

	@Override
	public void executeConcreteSystemOperation(TransferObject transferObject) {
		User user = (User) transferObject.getRequest();
		Broker broker = new Broker();
		broker.update(user);

	}

}
