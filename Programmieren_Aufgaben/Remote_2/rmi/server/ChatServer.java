package rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import rmi.client.ChatClientInterface;

public class ChatServer extends UnicastRemoteObject implements
		ChatServerInterface {

	protected ChatServer() throws RemoteException {
		super();
	}

	@Override
	public void register(ChatClientInterface client) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregister(ChatClientInterface client) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void post(String user, String message) throws RemoteException {
		// TODO Auto-generated method stub
	}

}
