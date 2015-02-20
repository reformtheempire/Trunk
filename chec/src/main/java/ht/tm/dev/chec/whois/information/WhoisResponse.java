package ht.tm.dev.chec.whois.information;

/**
 * Used to hold a WHOIS response
 * 
 * @author Thomas Mather
 *
 */
public class WhoisResponse {

	private String response;

	public WhoisResponse(String response) {
		this.response = response;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

}
