package raceCondition;

public class User extends Thread{
	Counter c;
	public User() {}
	public User(Counter c) {
		this.c=c;
	}
	
	@Override
	public void run() {
		//1 way to increase the count value for each instance thread
		for(int i=1;i<=1000;i++)
			c.count++;
		/*
		 * 2 way to increase the count value for 
		 * each instance thread is by calling increment() in run() method
		 * c.increment();
		 */
		super.run();
	
	}

}
