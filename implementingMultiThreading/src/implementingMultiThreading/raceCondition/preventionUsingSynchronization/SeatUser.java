package implementingMultiThreading.raceCondition.preventionUsingSynchronization;

public class SeatUser extends Thread {
	
	Counter counterObject;
	public SeatUser() {}
	public SeatUser(Counter counterObject) {
		this.counterObject=counterObject;
	}
	
	@Override
	public void run() {
		counterObject.increment();
		super.run();
	}
}
