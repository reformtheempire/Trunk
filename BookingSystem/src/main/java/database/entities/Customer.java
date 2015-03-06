package database.entities;

public class Customer {

	public int getID() {
		return ID;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getBusinessName() {
		return businessName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public String getCity() {
		return city;
	}

	public String getCounty() {
		return county;
	}

	public String getCountry() {
		return country;
	}

	public String getPostcode() {
		return postcode;
	}

	int ID;
	String fname;
	String lname;
	String businessName;
	String addressLine1;
	String addressLine2;
	String addressLine3;
	String city;
	String county;
	String country;
	String postcode;
	
	public Customer(int ID, String fname, String lname, String businessName,
			String addressLine1, String addressLine2, String addressLine3,
			String city, String county, String country, String postcode) {
		super();
		this.ID = ID;
		this.fname = fname;
		this.lname = lname;
		this.businessName = businessName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.county = county;
		this.country = country;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", fname=" + fname + ", lname=" + lname
				+ ", businessName=" + businessName + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2
				+ ", addressLine3=" + addressLine3 + ", city=" + city
				+ ", county=" + county + ", country=" + country + ", postcode="
				+ postcode + "]";
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	
}
