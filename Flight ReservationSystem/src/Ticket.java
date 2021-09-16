
public class Ticket {

	// attributes below
	
	public int pnr;
	public int cost;
	public int seatNo;
	public Flight flight;
	public Passenger passenger;
	public String fromOrigin;
	public String toDestination;
	public String departureDateTime;
	public String arrivalDateTime;
	public boolean canceled;
	
	// Constructor below 
	
	public Ticket() {
		this.canceled=canceled;
	}
	
	
	// Methods below
	
	public String checkFlightStatus(){
		if (canceled==true)
			return "Confirmed" ;
			else
				return "Cancelled";

	}
	
	public void isCanceled() {
		
		canceled=true;
	}
	
	public int getFlightDuration() {
    
		return (parseInt(departureDateTime)- parseInt (arrivalDateTime));
	}


	private int parseInt(String departureDateTime2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
