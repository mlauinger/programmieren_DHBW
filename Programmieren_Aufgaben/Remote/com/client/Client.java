package com.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;

import com.server.MyServerInterface;

public class Client {
	public static void main(String[] args) {
		try {
			String url = "//127.0.0.1/BobDerBaumeister";
			MyServerInterface server = (MyServerInterface) Naming.lookup(url);
			System.out.println("Serverzeit " + server.getTime());
			System.out.println("lokale Zeit " + new Date());
		} catch (NotBoundException | MalformedURLException | RemoteException ex) {
			System.err.println(ex.getMessage());
		}
	}
}
