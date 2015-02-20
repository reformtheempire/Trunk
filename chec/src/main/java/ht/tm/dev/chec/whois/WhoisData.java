package ht.tm.dev.chec.whois;

import ht.tm.dev.chec.domain.Domain;
import ht.tm.dev.chec.whois.information.WhoisResponse;
import ht.tm.dev.chec.whois.information.WhoisServerDetails;

/**
 * DTO used to transfer WHOIS information.
 * 
 * @author Thomas Mather
 *
 */
public class WhoisData {

	private Domain domain;

	private WhoisServerDetails server;

	private WhoisResponse response;

	public WhoisData(Domain domain, WhoisServerDetails server) {
		this.domain = domain;
		this.server = server;
	}

	public Domain getDomain() {
		return domain;
	}

	public WhoisServerDetails getServer() {
		return server;
	}

	public WhoisResponse getResponse() {
		return response;
	}

	public void setResponse(WhoisResponse response) {
		this.response = response;
	}
	
	
}
