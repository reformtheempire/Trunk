package ht.tm.dev.chec.main;

import ht.tm.dev.chec.domain.Domain;
import ht.tm.dev.chec.whois.WhoisData;
import ht.tm.dev.chec.whois.information.WhoisServerDetails;
import ht.tm.dev.chec.whois.telstar.methods.TelstarWHOISInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chec {

	public static Properties props;
	public static Logger log;

	public static void main(String args[]) {
		log = LoggerFactory.getLogger(Chec.class);
		BasicConfigurator.configure();
		//setupProperties();
		
		WhoisData whoisData = new WhoisData(new Domain("google", "wales"), new WhoisServerDetails("whois.nic.wales", 43, "THE NOMINET WALES WHOIS SERVER"));
		
		TelstarWHOISInterface interface1 = new TelstarWHOISInterface(whoisData);
		interface1.setupConnector();
		interface1.attachCommunicator();
		interface1.getWhoisResponse();
		whoisData = interface1.getWhoisData();
		
	}

	public static void setupProperties() {
		props = new Properties();
		props.put("uk_WHOIS", "whois.nic.uk");
		props.put("uk_PORT", "43");
		try {
			props.store(new FileOutputStream(
					"src/main/resources/config.properties"),
					"SETTING PROPERTIES");
		} catch (FileNotFoundException e) {
			log.error("No Properties File Found", e);
		} catch (IOException e) {
			log.error("IO EXCEPTION - PROPERTIES LOAD.", e);
		}
	}
}
