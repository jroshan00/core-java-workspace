package implementingMultiThreading.creatingThread.usingRunnableInterface.sample_project;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new NumberTask(4));
		Thread t2 = new Thread(new LetterTask('D'));

		t1.start();
		t2.start();
	}

}
