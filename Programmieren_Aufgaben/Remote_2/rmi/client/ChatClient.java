package rmi.client;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient implements ChatClientInterface {

	private String username;

	public ChatClient() {
		createGui();
	}

	public static void main(String[] args) {
		new ChatClient();
	}

	private void createGui() {
		JFrame mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500, 500);
		mainFrame.setBackground(Color.blue);
		mainFrame.setVisible(true);
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.red);
		mainPanel.setSize(200, 200);
		mainFrame.add(mainPanel);
		JPanel loginPanel = createLogin();
		JPanel chatPanel = createChat();
		JPanel inputPanel = createInput();
		mainPanel.add(loginPanel);
		mainPanel.add(chatPanel);
		mainPanel.add(inputPanel);
	}

	private JPanel createChat() {
		JPanel chatPanel = new JPanel();
		JTextArea chatArea = new JTextArea(25, 40);
		chatArea.setEditable(false);
		chatPanel.add(chatArea);
		chatPanel.setVisible(true);
		return chatPanel;
	}

	private JPanel createInput() {
		JPanel inputPanel = new JPanel();
		JTextField chatText = new JTextField(20);
		JButton sendText = new JButton("send");
		inputPanel.add(chatText);
		inputPanel.add(sendText);
		inputPanel.setVisible(true);
		return inputPanel;
	}

	private JPanel createLogin() {
		JPanel loginPanel = new JPanel();
		loginPanel.setSize(200, 50);
		final JTextField nameField = new JTextField(20);
		final JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				username = nameField.getText();
				System.out.println(username);
				nameField.setEnabled(false);
				loginButton.setEnabled(false);
			}
		});
		loginPanel.add(nameField);
		loginPanel.add(loginButton);
		loginPanel.setVisible(true);
		return loginPanel;
	}

	@Override
	public void message(String message) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void message(String user, String message) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUser() throws RemoteException {
		return username;
	}

}
