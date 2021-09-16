
public class Contact {
	 
	// attributes below
	
	 String name;
	 String phoneNumber;
	 String emailId;
	 
	// Constructor below
	 
	 public Contact() {
		
	 }

	// Methods below
	 
	 public String getContactDetails() {
		 
return ("Name of the passenger: " + name + "," + "Phone Number: " + phoneNumber + "," + "Email Id: " + emailId);
	 }
	 public void updateContactDetails ( String contactDetails) {
		    this.name=name;
			this.phoneNumber=phoneNumber;
			this.emailId=emailId; 
	 }
}
