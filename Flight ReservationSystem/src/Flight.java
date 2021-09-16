
public class Flight {

	// attributes below
	
	public String flightNumber;
	public String airline;
	public int capacity;
	private int seatsBooked;
	
	
	// Constructor below
	
	public Flight() {
		
	}
	
	// Getters and Setters
	
	public int getSeatsBooked() {
		return seatsBooked;
	}
	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	
	// Methods below
	
	public String getFlightDetails() {
		
		return "Hello";
	}
	
	public boolean checkFlightAvailability() {
		
		return true;
	}
	
	public void updateBookingCounter() {
		
	}
	
}
