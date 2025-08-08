package implementingMultiThreading.irctc_ticket_booking;

public class SeatNotAvailableException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SeatNotAvailableException() {
	
	}
	
	public SeatNotAvailableException(String message){
		super(message);
	}

}
