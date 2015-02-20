package ht.tm.dev.telstar.communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TelstarCommunicator {
	
	private PrintWriter systemOut;
	private BufferedReader systemIn;
	
	public TelstarCommunicator() {
		systemOut = null;
		systemIn = null;
	}

	public void attachToSocket(Socket s){
		try {
			systemOut = new PrintWriter(s.getOutputStream(), true);
			systemIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (IOException e) {
			System.err.println("Failed to attach to socket");
			e.printStackTrace();
		}
	}
	
	public void sendCommand(String command){
		System.out.println("Sending Command: " + command);
		systemOut.println(command);
		System.out.println("Command Sent");
	}
	
	public String read(){
		String message;
		StringBuilder response = new StringBuilder();
		try {
			while ((message = systemIn.readLine()) != null) {
				System.out.println(message);
				response.append(message);
			}
		} catch (IOException e) {
			System.err.println("Cannot read from server");
			e.printStackTrace();
		}
		return response.toString();
	}
	
}
