package raceConditionPreventionUsingThreadLocalClass;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		UserOperations operation1 = new UserOperations(1);
	
		User user1=new User(operation1.userId);
		User user2=new User(operation1.userId);
		User user3=new User(operation1.userId);
		
		user1.start();
		user2.start();
		user3.start();
		
		user1.join();
		user2.join();
		user3.join();
		
		System.out.println("Total Count of userId is : " + operation1.userId);
		
		System.out.println("-----Main Exits-----");
	}

}
