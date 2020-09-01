package com.comtraed.thread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.comtrade.domen.TransferObject;
import com.comtraed.controllerBL.CommandBase;
import com.sun.corba.se.spi.servicecontext.SendingContextServiceContext;

public class ClientThread extends Thread {
	private Socket socket;

	public ClientThread(Socket socket) {
		super();
		this.socket = socket;
	}
	@Override
	public void run() {
		while (true) {
			try {
				ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
				TransferObject transferObject = (TransferObject) objectInputStream.readObject();
				processTheData(transferObject);
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
	}
	

	}
	private void processTheData(TransferObject transferObject) {
		CommandBase commadBase = null;
		switch (transferObject.getConstantesFC()) {
		case HOME_ADRESS:
			
			break;

		default:
			break;
		}
		commadBase.execute(transferObject);
		send(transferObject);
		
	}
	private void send(TransferObject transferObject) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			objectOutputStream.writeObject(transferObject);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
