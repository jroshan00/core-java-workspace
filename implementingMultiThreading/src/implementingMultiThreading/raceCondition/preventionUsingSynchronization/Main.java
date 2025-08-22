package implementingMultiThreading.raceCondition.preventionUsingSynchronization;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Counter counterObject=new Counter();
		SeatUser seatuser1=new SeatUser(counterObject);
		SeatUser seatuser2=new SeatUser(counterObject);
		SeatUser seatuser3=new SeatUser(counterObject);
		
		seatuser1.start();
		seatuser2.start();
		seatuser3.start();
		
		seatuser1.join();
		seatuser2.join();
		seatuser3.join();
		System.out.println("The total seat booked is : " + counterObject.countSeat);
		
		System.out.println("------------------Main Exits------------------");
		
		
	}
	

	
	

}
