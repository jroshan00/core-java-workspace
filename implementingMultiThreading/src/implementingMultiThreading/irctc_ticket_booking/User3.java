package implementingMultiThreading.irctc_ticket_booking;

public class User3 extends Thread{
	@Override
	public void run() {
		System.out.println("====User3 Booking Start====");
		try {
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			new IrctcService().bookingTicket("", "", "");
			System.out.println("====User3 Booking End====");
		} catch (SeatNotAvailableException e) {
			System.out.println(e.getMessage());
		}
	}
}
