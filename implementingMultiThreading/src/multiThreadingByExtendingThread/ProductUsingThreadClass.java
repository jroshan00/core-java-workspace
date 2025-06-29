package multiThreadingByExtendingThread;

public class ProductUsingThreadClass extends Thread {
	@Override
	public void run() {
		getProductDetials();
	}
	
	@SuppressWarnings("deprecation")
	public void getProductDetials() {
		System.out.println("Current Thread/Product name name is " + Thread.currentThread().getName());
		System.out.println("Product id is " + Thread.currentThread().getId());
		System.out.println("Product priority is " + Thread.currentThread().getPriority());
	}

}
