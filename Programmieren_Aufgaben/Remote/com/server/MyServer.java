package com.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class MyServer extends UnicastRemoteObject implements MyServerInterface {
	MyServer() throws RemoteException {
		super();
	}

	public Date getTime() {
		Date date = new Date();
		System.out.println("Server-Time: " + date);
		return date;
	}

}