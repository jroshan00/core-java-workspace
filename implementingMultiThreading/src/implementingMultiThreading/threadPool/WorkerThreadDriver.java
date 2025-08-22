package implementingMultiThreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThreadDriver {
	
	public static void main(String[] args) throws Exception {
		System.out.println("..........main() starts...........");
		ExecutorService executorService= Executors.newFixedThreadPool(4);
		try {
		for(int i=1;i<=6;i++) {
			WorkerThread worker=new WorkerThread("Task : "+i);
			executorService.execute(worker);
		}
		}finally {
			executorService.shutdown();
			System.err.println("..........main() ends...........");
		}
		
	}

}
