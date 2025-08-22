package implementingMultiThreading.creatingThread.usingThreadClass.sample_project;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("---main started---");
		Thread t1 = new NumberThread(4);
		Thread t2 = new CharacterThread('D');

		t1.start(); // starts thread-1
		t2.start(); // starts thread-2
		
		t1.join(); // thread 1 joined main thread(that means main will wait for thread-1 to get finished)
		t2.join(); // thread 2 joined main thread(that means main will wait for thread-2 to get finished)
		
		System.out.println("---main ended---");
	}

}
