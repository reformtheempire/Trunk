package ht.tm.dev.chec.whois.telstar.methods;

import ht.tm.dev.chec.whois.WhoisData;
import ht.tm.dev.chec.whois.information.WhoisResponse;
import ht.tm.dev.telstar.communication.TelstarCommunicator;
import ht.tm.dev.telstar.connector.TelstarConnector;

public class TelstarWHOISInterface {

	private WhoisData whoisData;
	private TelstarCommunicator communicator;
	private TelstarConnector connector;

	public TelstarWHOISInterface(WhoisData whoisData) {
		communicator = new TelstarCommunicator();
		this.whoisData = whoisData;
	}
	
	/**
	 * Returns true if connection is Established.
	 * @param host
	 * @param port
	 * @return
	 */
	public boolean setupConnector(){
		connector = new TelstarConnector(whoisData.getServer().getAddress(), whoisData.getServer().getPort());
		return connector.establishConnection();
	}
	
	public boolean attachCommunicator(){
		return communicator.attachToSocket(connector.getConnection());
	}
	
	public void getWhoisResponse(){
		communicator.sendCommand(whoisData.getDomain().getKey() + "." + whoisData.getDomain().getSuffix());
		whoisData.setResponse(new WhoisResponse(communicator.read()));
		connector.closeConnection();
	}

	public WhoisData getWhoisData() {
		return whoisData;
	}

	public void setWhoisData(WhoisData whoisData) {
		this.whoisData = whoisData;
	}

	public TelstarCommunicator getCommunicator() {
		return communicator;
	}

	public void setCommunicator(TelstarCommunicator communicator) {
		this.communicator = communicator;
	}

	public TelstarConnector getConnector() {
		return connector;
	}

	public void setConnector(TelstarConnector connector) {
		this.connector = connector;
	}
	
	
}
