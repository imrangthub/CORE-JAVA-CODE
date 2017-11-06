package ComplesBeansExpLan;

import java.util.Collection;

public class Address {
	
	private String line1;
	private String town;
	private String country;
	private String postcode;
	
	private Collection phoneNumber;
	
	public Address(){
		this.line1 = "No line update";
		this.town = "No City";
		this.country = "No Country";
		this.postcode = "0000";
	}
	
	
	
	

	public Collection getPhoneNumber() {
		return phoneNumber;
	}





	public void setPhoneNumber(Collection phoneNumber) {
		this.phoneNumber = phoneNumber;
	}





	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	
	

}
