package raceConditionPreventionUsingAtomicIntegerClass;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Counter counterObject=new Counter();
		User user1=new User(counterObject);
		User user2=new User(counterObject);
		User user3=new User(counterObject);
		
		Thread t1= new Thread(user1);
		Thread t2= new Thread(user2);
		Thread t3= new Thread(user3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Total count is : "+ counterObject.count.get());
		System.out.println("--------Main Exits--------");
		
		
	}

}
