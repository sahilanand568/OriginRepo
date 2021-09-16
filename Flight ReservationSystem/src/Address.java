
public class Address {

	// attributes below
	
	String street;
	String city;
	String state;
	
	// Constructor below
	
	public Address() {
		
	}
	
	// Methods below
	
	public String getAddressDetails() {
		
		return ("Street: " + street + "," + "City: " + city + "," + "State: " + state );
	}
	
	
	public void updateAddressDetails(String addressDetails) {
		this.street=street;
	    this.city=city;
    	this.state=state;
	}
}
