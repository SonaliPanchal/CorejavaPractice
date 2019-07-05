package bus.reservation.system;

public class TicketBooking extends Thread{

	private TicketCounter ticketCounter;
	String passengerName;
	int noOfSeatTobook;
	
	public TicketBooking(TicketCounter ticketCounter, String passengerName, int noOfSeatTobook) {
		super();
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.noOfSeatTobook = noOfSeatTobook;
	}
	
	public void run()
	{
		ticketCounter.bookTicket(passengerName, noOfSeatTobook);
	}
	
}
