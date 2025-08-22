package implementingMultiThreading.raceCondition.preventionUsingSynchronization;

public class Counter {
	public int countSeat=0;
	public static int noOfSeats=1000;
	
	public Counter() {}
	
	//(a) Synchronized Method
	public synchronized void increment() {
		for(int i=1;i<=noOfSeats;i++)	{
			countSeat++;
		}
	}
	
/*
    //(b) Using Synchronized Block
	public void increment() {
		//method statements
		synchronized (this) {
			for(int i=1;i<=noOfSeats;i++){
				countSeat++;
			}
		}
		
	}
*/
	
}
