package implementingMultiThreading.creatingThread.usingThreadClass;

public class ProductController {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.err.println("\n------------MAIN STARTS------------\n");
		
		//Setting name of main thread (deafult name is  :  main)
		Thread.currentThread().setName("MyMainThread");
		
		//NEW STATE
		Product p1 = new Product("Laptop");
		Product p2 = new Product("Phone");
		
		//Setting name of each thread created using setter methods available in Thread class
		p1.setName("LaptopThread");
		p2.setName("PhoneThread");

		System.out.println("\n------------------------\n");
		System.out.println("productName of p1 is  :" + p1.getName());
		System.out.println("productId of p1 is  :" + p1.getId());
		System.out.println("productName of p2 is  :" + p2.getName());
		System.out.println("productId of p2 is  :" + p2.getId());

		System.out.println("\n------------------------\n");

		//This executes inside main thread (not multithreading yet).
		p1.getProductDetials();
		p2.getProductDetials();

		System.out.println("\n------------------------\n");
		

		/*
		 * 
		 * Now the JVM spawns 2 new threads -> they will execute the overridden run() -> which calls getProductDetials().
		 * This time you’ll see:
		 * Different thread names (LaptopThread, PhoneThread) Note : if thread names were not set manually JVM will have given (Thread-0, Thread-1)
		 * Different IDs
		 * Priority (default = 5)
		 * 
		 */
		
		//RUNNABLE STATE --> RUNNING STATE --> BLOCKED STATE --> RUNNABLE STATE
		p1.start();
		p2.start();
		
		//Main doesn’t wait for them because you didn’t call join().
		//p1.join();
		//p2.join();
		
		System.err.println("\n------------MAIN EXIT------------\n");
		//DEAD STATE

	}

}
