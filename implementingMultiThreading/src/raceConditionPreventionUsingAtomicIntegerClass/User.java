package raceConditionPreventionUsingAtomicIntegerClass;


public class User implements Runnable{
	Counter countObject;
	public User() {}
	public User(Counter countObject) {
		this.countObject=countObject;
	}
	@Override
	public void run() {
		for(int i=1;i<=1000;i++)
			countObject.increment();
	}
	
	
		
	

}
