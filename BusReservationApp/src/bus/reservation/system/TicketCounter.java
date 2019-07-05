package bus.reservation.system;

public class TicketCounter {

	private int availableSeats = 5;
	
	public synchronized void bookTicket(String name,int noOfSeats)
	{
		if((availableSeats>=noOfSeats)&&(noOfSeats > 0))
		{
			System.out.println("hello congrats "+name+"::"+noOfSeats+"  your seat booked succfully");
			availableSeats = availableSeats - noOfSeats;
		}
		else
		{
			System.out.println("Seats not available");
		}
	}
}
