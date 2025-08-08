package implementingMultiThreading.irctc_ticket_booking;

public class User4 extends Thread {
	@Override
	public void run() {
		System.out.println("====User4 Booking Start====");
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
			System.out.println("====User4 Booking End====");
		} catch (SeatNotAvailableException e) {
			System.out.println(e.getMessage());
		}
	}
}
