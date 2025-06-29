package multiThreadingByExtendingThread;

public class ProductDriverWithoutJoin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
			ProductUsingThreadClass p1= new ProductUsingThreadClass();
			ProductUsingThreadClass p2= new ProductUsingThreadClass();
			
			System.out.println("\n------------------------\n");
			
			System.out.println("productId of p1 is  :" + p1.getId());
			System.out.println("productName of p1 is  :" + p1.getName());
			System.out.println("productId of p2 is  :" + p2.getId());
			System.out.println("productName of p2 is  :" + p2.getName());
			
			System.out.println("\n------------------------\n");
			
			/*
			 * main thread will execute the below Thread object as star() is not used.
			 * start() is mandatory 
			 * in order to make threads by Run() method having logic provided. 
			 */
			p1.getProductDetials();
			p2.getProductDetials();
			
			System.out.println("\n------------------------\n");
			
			/*
			 * main thread will not wait for t1 & t2 to be successfully 
			 * executed as join() is not used
			 */
			p1.start();
			p2.start();
			
			System.out.println("\n------------MAIN EXIT------------\n");

	}

}
