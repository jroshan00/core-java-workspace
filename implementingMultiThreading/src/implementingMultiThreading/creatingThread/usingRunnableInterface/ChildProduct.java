package implementingMultiThreading.creatingThread.usingRunnableInterface;

public class ChildProduct extends Product {

	ChildProduct() {
	}

	// Using Constructor Injection
	ChildProduct(String productName) {
		super(productName);
	}

	@Override
	public void run() {
		/*
		 * It prints the priority of the thread currently running this code. 
		 * If it’s t1, priority is 1. 
		 * If it’s t2, priority is 5. 
		 * If it’s t3, priority is 10.
		 * 
		 */
		super.getProductDetials();

		try {
			for (int i = 1; i <= 3; i++) {
				System.out.println(getProductName() + " running in " + Thread.currentThread().getName()
						+ " | Iteration: " + i + " | Priority: " + Thread.currentThread().getPriority());

				// Simulate work
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(getProductName() + " was interrupted!");
		}
	}

}
