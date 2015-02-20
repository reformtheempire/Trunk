package ht.tm.dev.telstar.connector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TelstarConnector {
	
	private String host;
	private int port;
	private Socket connection;
	
	public TelstarConnector(String host, int port) {
		this.host = host;
		this.port = port;
		connection = new Socket();
	}

	public void establishConnection(){
		try {
			connection.connect(new InetSocketAddress(host, port));
			System.out.println("Connected to: " + host + ":" + port);
		} catch (IOException e) {
			System.err.println("Cannot Connect to " + host + ":" + port);
			e.printStackTrace();
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Socket getConnection() {
		return connection;
	}
	
	public void closeConnection(){
		try {
			connection.close();
		} catch (IOException e) {
			System.err.println("could not close connection");
			e.printStackTrace();
		}
	}
	
}
