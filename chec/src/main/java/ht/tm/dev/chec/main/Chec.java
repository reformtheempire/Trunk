package ht.tm.dev.chec.main;

import ht.tm.dev.chec.command.CommandCentre;
import ht.tm.dev.chec.domain.Domain;
import ht.tm.dev.chec.whois.WhoisData;
import ht.tm.dev.chec.whois.information.WhoisServerDetails;
import ht.tm.dev.chec.whois.server.ServerManager;
import ht.tm.dev.chec.whois.telstar.methods.TelstarWHOISInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chec {

	public static Logger log;

	public static void main(String args[]) {
		log = LoggerFactory.getLogger(Chec.class);
		BasicConfigurator.configure();
		
		ServerManager serverManager = new ServerManager();
		serverManager.setupProperties();
		serverManager.getServerDetails("UK");
		
		//CommandCentre.getWhoisData(args);
		
		//setupProperties();
		
		WhoisData whoisData = new WhoisData(new Domain("google", "wales"), new WhoisServerDetails("whois.nic.wales", 43, "THE NOMINET WALES WHOIS SERVER"));
		
		TelstarWHOISInterface interface1 = new TelstarWHOISInterface(whoisData);
		interface1.setupConnector();
		interface1.attachCommunicator();
		interface1.getWhoisResponse();
		whoisData = interface1.getWhoisData();
		
	}

	
}
