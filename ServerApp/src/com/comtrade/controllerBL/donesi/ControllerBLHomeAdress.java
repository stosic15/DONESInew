package com.comtrade.controllerBL.donesi;

import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.TransferObject;
import com.comtrade.servis.GeneralSystemOperation;
import com.comtrade.servis.ServisHomeAdressGET_ALL;
import com.comtrade.servis.ServisHomeAdressInsert;
import com.comtraed.controllerBL.CommandBase;

public class ControllerBLHomeAdress implements CommandBase{

	@Override
	public void execute(TransferObject transferObject) {
		GeneralSystemOperation go = null;
		if(transferObject.getConstantesBL() == ConstantesBL.POST) {
			go = new ServisHomeAdressInsert();
		if(transferObject.getConstantesBL()== ConstantesBL.GET_ALL) {
			go = new ServisHomeAdressGET_ALL();
		    }
		}
		go.executeGeneralSystemOperation(transferObject);
		
	}

}
