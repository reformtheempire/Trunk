package ht.tm.dev.chec.whois.information;

/**
 * Class that holds information about a WHOIS server
 * 
 * @author Thomas Mather
 *
 */
public class WhoisServerDetails {

	private String address;
	private int port;
	private String description;
	private String suffix;

	public WhoisServerDetails(String address, int port, String description) {
		this.address = address;
		this.port = port;
		this.description = description;
	}

	public String getSuffix() {
		return suffix;
	}

	public String getAddress() {
		return address;
	}

	public int getPort() {
		return port;
	}

	public String getDescription() {
		return description;
	}

}
