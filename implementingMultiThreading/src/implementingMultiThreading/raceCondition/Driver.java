package implementingMultiThreading.raceCondition;

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		User one=new User(c);
		User two=new User(c);
		User three=new User(c);
		
		one.start();
		two.start();
		three.start();
		
		one.join();
		two.join();
		three.join();
		System.out.println("Total count is : " + c.count);
	}

}
