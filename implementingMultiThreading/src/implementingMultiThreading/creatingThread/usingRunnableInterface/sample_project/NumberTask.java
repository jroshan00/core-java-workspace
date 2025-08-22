package implementingMultiThreading.creatingThread.usingRunnableInterface.sample_project;

public class NumberTask implements Runnable {
	int number;
	NumberTask(int number){
		this.number=number;
	}

	@Override
	public void run() {
		for (int i = 1; i <= number; i++) {
			System.out.println("Number : "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
