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
import java.util.Collection;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chec {

	public static Logger log;

	public static void main(String args[]) {
		if(args == null || args.length == 0){
			log.error("No Domain Specified");
			System.exit(1);
		}
		log = LoggerFactory.getLogger(Chec.class);
		BasicConfigurator.configure();
		
//		ServerManager serverManager = new ServerManager();
//		serverManager.setupProperties();
//		serverManager.getServerDetails("UK");
		
		
		
	
		
		CommandCentre.getWhoisData(args);
		Collection<String> parameters;
		if(CommandCentre.hasParams()){
			parameters = CommandCentre.getParams();
			CommandCentre.examineParameters(parameters);
		}
		
		WhoisData whoisData = CommandCentre.getData();
		
		TelstarWHOISInterface interface1 = new TelstarWHOISInterface(whoisData);
		interface1.setupConnector();
		interface1.attachCommunicator();
		interface1.getWhoisResponse();
		whoisData = interface1.getWhoisData();
		
	}

	
}
