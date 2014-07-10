package com.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface MyServerInterface extends Remote {
	public Date getTime() throws RemoteException;
}