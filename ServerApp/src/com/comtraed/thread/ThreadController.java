package com.comtraed.thread;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadController {
	private volatile static ThreadController instance ;
	private List<ClientThread>clientList = CopyOnWriteArrayList();
	private ThreadController() {
		
		
	}
	
	public static ThreadController getInstance() {
		if(instance == null ) {
			synchronized (ThreadController.class) {
				if(instance == null) {
				instance = new ThreadController();
		}
	
	}

}
		return instance;
	}
	public void addClient(ClientThread clientThread) {
		clientList.add(clientThread);
	}
	private List<ClientThread> CopyOnWriteArrayList() {
		return clientList;
	}
	
}
