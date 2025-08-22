package implementingMultiThreading.creatingThread.usingRunnableInterface;

public class ProductController {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("\n------------MAIN STARTS------------\n");
		Product p1 = new Product("Face Cream");
		Product p2 = new Product("Hair Oil");
		
		//NEW STATE -> Thread is created
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);


		System.out.println("productId of t1 as a thread object of p1 object is  :" + t1.getId());
		System.out.println("productName of t1 as a thread object of p1 object is  :" + t1.getName());
		System.out.println("productId of t2 as a thread object of p2 object is  :" + t2.getId());
		System.out.println("productName of t2 as a thread object of p2 object is  :" + t2.getName());

		System.out.println("\n-- no multithreading here-- \n");

		// Executed by main thread (no multithreading here)
		p1.getProductDetials();
		p2.getProductDetials();

		System.out.println("\n-- multithreading here-- \n");

		// RUNNABLE -> START threads
		t1.start();
		t2.start();

		// Make main thread wait for t1 and t2 to finish
		t1.join();
		t2.join();

		System.out.println("\n------------MAIN EXIT------------\n");
	}
}
