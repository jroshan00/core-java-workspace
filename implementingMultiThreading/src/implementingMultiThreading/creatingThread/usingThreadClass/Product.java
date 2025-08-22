package implementingMultiThreading.creatingThread.usingThreadClass;

public class Product extends Thread {
	private String productName;

	public Product() {
	}

	public Product(String productName) {
		this.productName = productName;
	}

	@Override
	public void run() {
		getProductDetials();
	}

	@SuppressWarnings("deprecation")
	public void getProductDetials() {
		System.out.println("Current Thread name of product " + productName + " is " + Thread.currentThread().getName());
		System.out.println("Current Thread id of product " + productName + " is " + Thread.currentThread().getId());
		System.out.println(
				"Current Thread priority of product " + productName + " is " + Thread.currentThread().getPriority());
	}

	public String getProductName() {
		return this.productName;
	}

}
