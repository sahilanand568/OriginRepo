
public class Flight {

	// attributes below
	
	public String flightNumber;
	public String airline;
	public int capacity;
	private int seatsBooked;
	
	
	// Constructor below
	
	public Flight() {
		this.seatsBooked=seatsBooked;
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
		
		return ("Flight Number is: " + flightNumber + "," + "Airline is: " + airline + "," + "Total capacity of the flight is: " + capacity + "Number of Seats booked is: " + this.seatsBooked);
	}
	
	public boolean checkFlightAvailability() {
		if (capacity-seatsBooked >0)
		        return true;
		else
			return false;
	}
	
	public void updateBookingCounter() {
		this.seatsBooked=seatsBooked;
	}
	
}
