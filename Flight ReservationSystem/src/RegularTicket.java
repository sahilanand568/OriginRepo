
public class RegularTicket extends Ticket {

	// attributes below
	
	public String additionalServices;
	
	// Constructor below
	
	 public RegularTicket() {
		 this.additionalServices=additionalServices;
	 }
	 
	// Methods below
	
	public String getAdditionalServices() {
		
		return additionalServices;
	}
	
	public void updateAdditionalServices(String additionalServices) {
		this.additionalServices=additionalServices;
	}
	
}
