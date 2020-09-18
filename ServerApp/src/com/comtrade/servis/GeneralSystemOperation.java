package com.comtrade.servis;

import java.io.Serializable;

import com.comtrade.connections.Connections;
import com.comtrade.domen.TransferObject;

public abstract class GeneralSystemOperation {
	public void executeGeneralSystemOperation(TransferObject transferObject ) {
		try {
		startTransaction();
		executeConcreteSystemOperation(transferObject);
		confirmTansaction();
		}catch(Exception e) {
			e.printStackTrace();
			undoTransaction();
		}finally {
			closeTransaction();
		}
		
	}

	public void closeTransaction() {
		Connections.getInstance().closeConnection();
		
	}

	public void undoTransaction() {
		Connections.getInstance().undoTransaction();
		
	}

	public void confirmTansaction() {
		// TODO Auto-generated method stub
		Connections.getInstance().confirmTansaction();
		
	}

	public abstract void executeConcreteSystemOperation(TransferObject transferObject);

	public void startTransaction() throws ClassNotFoundException {
		Connections.getInstance().startTransaction();
		
	}

}
