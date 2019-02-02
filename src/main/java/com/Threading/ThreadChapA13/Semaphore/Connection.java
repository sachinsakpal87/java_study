package com.threading.ThreadChapA13.Semaphore;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection instance = null;
	private int noOfConnections;
	private Semaphore semaphore = new Semaphore(10, true);

	private Connection() {
	}

	public static Connection getConnection() {
		if (instance == null) {
			instance = new Connection();
		}
		return instance;
	}

	public void connect() throws InterruptedException {
		semaphore.acquire();
		try {
			doconnect();
		} finally {
			semaphore.release();
		}
	}

	public void doconnect() throws InterruptedException {

		synchronized (this) {
			noOfConnections++;
			System.out.println("Current connections: " + noOfConnections);
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synchronized (this) {
			noOfConnections--;
		}
	}
}
