package ht.tm.dev.chec.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ht.tm.dev.chec.main.Chec;
import ht.tm.dev.chec.whois.WhoisData;
import ht.tm.dev.chec.whois.server.ServerManager;

public class CommandCentre {
	
	private static Collection<String> params = new ArrayList<String>();
	private static Logger log;
	private static WhoisData data;
	
	public CommandCentre() {
		log = LoggerFactory.getLogger(CommandCentre.class);
	}
	

	public static WhoisData getWhoisData(String[] args) {
		for (String string : args) {
			if (!StringUtils.isWhitespace(string)) {
				if(checkForParameter(string)){
					log.info("Parameter Loaded");
				}
				String[] domain = StringUtils.split(string);
				if(domain.length == 2){
					data = new WhoisData(domain[0], ServerManager.getServerDetails(domain[1]));
				}
			}
		}
	}

	private static boolean checkForParameter(String arg) {
		if(StringUtils.startsWith(arg, "-")){
			StringUtils.remove(arg, "-");
			params.add(arg);
			return true;
		}else{
			return false;
		}
	}

}
