package com.comtraed.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadServer extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		startServer();
	}

	private void startServer() {
		
		try {
			ExecutorService executorService = Executors.newCachedThreadPool();
			ServerSocket serverSocket = new ServerSocket(9000);
			while(true) {
				Socket socket = serverSocket.accept();
				ClientThread  clientThread = new ClientThread(socket);
				executorService.execute(clientThread);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
