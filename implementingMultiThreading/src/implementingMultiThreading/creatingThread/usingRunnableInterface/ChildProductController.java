package implementingMultiThreading.creatingThread.usingRunnableInterface;

public class ChildProductController {

	public static void main(String[] args) throws InterruptedException {

		ChildProduct p1 = new ChildProduct("ChildProduct-1");
		ChildProduct p2 = new ChildProduct("ChildProduct-2");
		ChildProduct p3 = new ChildProduct("ChildProduct-3");

		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);

		// Assign different priorities
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); // 10

		System.out.println("\n--- Thread Info Before Start ---");
		System.out.println("t1 -> " + t1.getName() + " | Priority: " + t1.getPriority());
		System.out.println("t2 -> " + t2.getName() + " | Priority: " + t2.getPriority());
		System.out.println("t3 -> " + t3.getName() + " | Priority: " + t3.getPriority());

		System.out.println("\n--- Execution Starts ---\n");

		t1.start();
		t2.start();
		t3.start();

		// Wait for all child threads
		t1.join();
		t2.join();
		t3.join();

		System.out.println("\n--- MAIN EXIT ---\n");
	}

}
