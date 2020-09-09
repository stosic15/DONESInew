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

	private void closeTransaction() {
		Connections.getInstance().closeConnection();
		
	}

	private void undoTransaction() {
		Connections.getInstance().undoTransaction();
		
	}

	private void confirmTansaction() {
		// TODO Auto-generated method stub
		Connections.getInstance().confirmTansaction();
		
	}

	protected abstract void executeConcreteSystemOperation(TransferObject transferObject);

	private void startTransaction() {
		Connections.getInstance().startTransaction();
		
	}

}
