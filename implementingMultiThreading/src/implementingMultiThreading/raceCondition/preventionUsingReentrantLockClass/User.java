package implementingMultiThreading.raceCondition.preventionUsingReentrantLockClass;

public class User extends Thread {
	Counter counterObject;
	public User() {}
	public User(Counter counterObject) {
		this.counterObject=counterObject;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=1000;i++)
			counterObject.increment();
		super.run();
	}

}
