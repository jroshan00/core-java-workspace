package implementingMultiThreading.irctc_ticket_booking;

public class IrctcApp {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("============================Main START========================");
		User1 user1=new User1();
		User2 user2=new User2();
		User3 user3=new User3();
		User4 user4=new User4();
		User5 user5=new User5();
		User6 user6=new User6();
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
		
		user1.join();
		user2.join();
		user3.join();
		user4.join();
		user5.join();
		user6.join();
	
		System.out.println("============================Main END========================");
		
	}

}
