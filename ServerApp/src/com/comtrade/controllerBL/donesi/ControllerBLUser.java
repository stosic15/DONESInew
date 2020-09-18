package com.comtrade.controllerBL.donesi;

import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.TransferObject;
import com.comtrade.servis.GeneralSystemOperation;
import com.comtrade.servis.ServisUserDataUpdate;
import com.comtrade.servis.ServisUserLogin;
import com.comtrade.servis.ServisUserRegistration;
import com.comtraed.controllerBL.CommandBase;

public class ControllerBLUser implements CommandBase {

	@Override
	public void execute(TransferObject transferObject) {
		GeneralSystemOperation go = null;
		if(transferObject.getConstantesBL() == ConstantesBL.POST) {
			go = new ServisUserRegistration();
		}else if(transferObject.getConstantesBL() == ConstantesBL.SELECT_DISTINCT) {
			go = new ServisUserLogin();
		}else if (transferObject.getConstantesBL() == ConstantesBL.PUT) {
			go = new ServisUserDataUpdate();
		}
		
		go.executeGeneralSystemOperation(transferObject);

	}
	

}
