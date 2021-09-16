
public class TouristTicket extends Ticket {

	// attributes below
	
	public String hotelAddress;
	public String[] selectTouristLocation = new String[5]; 
	
	// Constructor below
	
 public TouristTicket() {
		 this.hotelAddress=hotelAddress;
		 this.selectTouristLocation=selectTouristLocation;
	 }
	
	// Methods below
	
 public String getHotelAddress() {
	 
	 return this.hotelAddress;
 }
 
 public String[] getTouristLocations() {
	 
	 return selectTouristLocation;
 }
 
 public void addTouristLocations(String location) {
		
	}

 public void removeTouristLocations(String location) {
		
	}

	
}
