package ht.tm.dev.chec.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ht.tm.dev.chec.domain.Domain;
import ht.tm.dev.chec.domain.utils.DomainUtils;
import ht.tm.dev.chec.main.Chec;
import ht.tm.dev.chec.whois.WhoisData;
import ht.tm.dev.chec.whois.information.WhoisServerDetails;
import ht.tm.dev.chec.whois.server.ServerManager;

public class CommandCentre {

	private static Collection<String> params = new ArrayList<String>();
	private static Logger log;
	private static WhoisData data;
	private static boolean hasParams;

	public CommandCentre() {
		log = LoggerFactory.getLogger(CommandCentre.class);
	}

	public static WhoisData getWhoisData(String[] args) {
		for (String string : args) {
			if (!StringUtils.isWhitespace(string)) {
				if (checkForParameter(string)) {
					log.info("Parameter Loaded");
					hasParams = true;
				}
				String[] domain = StringUtils.split(string, ".");
				if (DomainUtils.isDotCom(domain)) {
					data = new WhoisData(new Domain(domain[0], "com"), new WhoisServerDetails("whois.verisign-grs.com", 43, "The verisign whois Server"));
				} else if (domain.length == 2) {
					data = new WhoisData(new Domain(domain[0], domain[1]), new WhoisServerDetails("whois.nic." + domain[1], 43, "A whois server"));
				} else if (domain.length > 1) {
					String domainName = domain[0] + "." + domain[1];
					String domainSuffix = domain[domain.length - 1];
					data = new WhoisData(new Domain(domainName, domainSuffix), new WhoisServerDetails("whois.nic." + domainSuffix, 43, "The ." + domainSuffix + " WHOIS Server"));
				} else {
					log.error("Cannot Run CHEC on tld");
				}
			}
		}
		return data;
	}

	public static Collection<String> getParams() {
		return params;
	}

	public static boolean hasParams() {
		return hasParams;
	}

	private static boolean checkForParameter(String arg) {
		if (StringUtils.startsWith(arg, "-")) {
			StringUtils.remove(arg, "-");
			params.add(arg);
			return true;
		} else {
			return false;
		}
	}

	public static void examineParameters(Collection<String> params) {
		for (String param : params) {
			if (param.equalsIgnoreCase("h")) {
				log.info("USAGE: \n" + "parameters: [domain.suffix] <parameters>");
				System.exit(0);
			}
		}

	}

	public static WhoisData getData() {
		return data;
	}

}
