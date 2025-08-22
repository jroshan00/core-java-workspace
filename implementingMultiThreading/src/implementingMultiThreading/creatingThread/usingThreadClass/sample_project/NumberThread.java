package implementingMultiThreading.creatingThread.usingThreadClass.sample_project;

public class NumberThread extends Thread {
	int number;
	public NumberThread() {}
	public NumberThread(int number) {
		this.number=number;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=number;i++) {
			System.out.println("Number: " + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
