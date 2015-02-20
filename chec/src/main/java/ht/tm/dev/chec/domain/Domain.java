package ht.tm.dev.chec.domain;

public class Domain {
	private String key;
	private String suffix;

	public Domain(String key, String suffix) {
		this.key = key;
		this.suffix = suffix;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

}
