package com.server;

import java.rmi.registry.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;

public class SetupServer {

	public static void main (String[] args) {
		SetupServer setup = new SetupServer();
		setup.createRMIRegistry();
		setup.createServerInstance();
	}
	
	private void createRMIRegistry() {
		try {
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
		} catch (RemoteException re) {
			System.err.println(re.getMessage());
		}
	}

	private void createServerInstance() {
		try {
			Naming.rebind("BobDerBaumeister", new MyServer());
		} catch (MalformedURLException ex) {
			System.err.println(ex.getMessage());
		} catch (RemoteException ex) {
			System.err.println(ex.getMessage());
		}
	}

}
