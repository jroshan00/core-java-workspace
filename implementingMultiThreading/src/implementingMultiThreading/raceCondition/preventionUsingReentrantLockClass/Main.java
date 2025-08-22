package implementingMultiThreading.raceCondition.preventionUsingReentrantLockClass;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Counter counterObject=new Counter();
		User user1=new User(counterObject);
		User user2=new User(counterObject);
		User user3=new User(counterObject);
		User user4=new User(counterObject);
	
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		
		user1.join();
		user2.join();
		user3.join();
		user4.join();
		
		System.out.println("Total counter1 is : "+ counterObject.counter1);
		System.out.println("Total counter2 is : "+ counterObject.counter2);
		System.out.println("----------Main Ends-----------");
	}

}
