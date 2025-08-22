package implementingMultiThreading.threadPool;

public class TaskDriver {
	public static void main(String[] args) throws InterruptedException {
		Task t1=new Task("Cleaning");
		Task t2=new Task("Serving");
		Task t3=new Task("Billing");
		Task t4=new Task("Music");
		Task t5=new Task("Electrician");
		Task t6=new Task("Cooking");
		Task t7=new Task("Cocktail");
		Task t8=new Task("Managing");
		Task t9=new Task("Security");
		Task t10=new Task("Parking");
		Task t11=new Task("Dancing");
		Task t12=new Task("Room Service");
		Task t13=new Task("Room Cleaning");
		Task t14=new Task("Delivery");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		t8.join();
		t9.join();
		t10.join();
		t11.join();
		t12.join();
		t13.join();
		t14.join();
	}

}
