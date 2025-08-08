package implementingMultiThreading.irctc_ticket_booking;

import java.time.LocalDateTime;
import java.util.Random;

public class IrctcService{
	public static int TOTAL_SEATS=100;
	public Ticket bookingTicket(String trainName,String boardingStation,String destination) throws SeatNotAvailableException {
		synchronized(this)  {
			Integer pnr=1000000+new Random(100000000*TOTAL_SEATS).nextInt();
			double fare=654.54;
			double distance=fare/10;
			LocalDateTime currentTime= LocalDateTime.now();
			if(TOTAL_SEATS>0) {
				TOTAL_SEATS--;
				System.out.println(TOTAL_SEATS);
				System.out.println("Ticket is booked successfully against PNR No : [ "+pnr+" ]" + " at time "+currentTime.toString());
				return new Ticket(((Integer)(Math.abs(pnr))).toString(),trainName,boardingStation,currentTime,destination,distance,fare);
			}else {
				throw new SeatNotAvailableException("No of seats are exhausted....");
			}
		}
	}
}
