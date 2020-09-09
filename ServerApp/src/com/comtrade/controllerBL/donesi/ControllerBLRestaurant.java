package com.comtrade.controllerBL.donesi;

import com.comtrade.broker.Broker;
import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.TransferObject;
import com.comtrade.servis.GeneralSystemOperation;
import com.comtrade.servis.ServiseRestaurantGet_ALL;
import com.comtraed.controllerBL.CommandBase;

public class ControllerBLRestaurant implements CommandBase {

	@Override
	public void execute(TransferObject transferObject) {
		GeneralSystemOperation go = null;
		if(transferObject.getConstantesBL() == ConstantesBL.GET_ALL) {
			go = new ServiseRestaurantGet_ALL(); 
		}
	go.executeGeneralSystemOperation(transferObject);	
	}

	

}
