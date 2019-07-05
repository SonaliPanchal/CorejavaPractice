package bus.reservation.client;

import bus.reservation.system.TicketBooking;
import bus.reservation.system.TicketCounter;

public class Test {

	public static void main(String[] args) {
		TicketCounter ticketCounter = new TicketCounter();
		TicketBooking t1 = new TicketBooking(ticketCounter, "sonali", 2);
		TicketBooking t2 = new TicketBooking(ticketCounter, "Rahul", 9);
		t1.start();
		t2.start();
	}
}
