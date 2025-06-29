package multiThreadingByImplementingRunnable;

public class ProductDriverUsingJoin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
			ProductUsingRunnableInterface p1= new ProductUsingRunnableInterface(); //object initialization
			ProductUsingRunnableInterface p2= new ProductUsingRunnableInterface(); //object initialization
			
			// New State
			Thread t1= new Thread(p1); //Thread Object Creation 
			Thread t2= new Thread(p2); //Thread Object Creation
			
			System.out.println("\n------------------------\n");
			
			System.out.println("productId of t1 as a thread object of p1 object is  :" + t1.getId());
			System.out.println("productName of t1 as a thread object of p1 object is  :" + t1.getName());
			System.out.println("productId of t2 as a thread object of p2 object is  :" + t2.getId());
			System.out.println("productName of t2 as a thread object of p2 object is  :" + t2.getName());
			
			System.out.println("\n------------------------\n");
			
			/*
			Here main thread will execute this call as start() is called also
			not possible here as p1 & p2 are not Thread Object here
			*/
			p1.getProductDetials();
			p2.getProductDetials();
			
			System.out.println("\n------------------------\n");
			
			//Runnable State
			t1.start();
			t2.start();
			
			//by using join() we make main thread to wait till t1 & t2 successfully executed
			t1.join();
			t2.join();
			
			System.out.println("\n------------MAIN EXIT------------\n");
			

	}

}
