package implementingMultiThreading.threadPool;

public class WorkerThread  implements Runnable{
	volatile String task;  //T refers to any task
	WorkerThread(){
		
	}
	WorkerThread(String task){
		this.task=task;
	}
	
	public synchronized void does() {
		try{
			System.out.println("doing task ["+task +"] now by "+Thread.currentThread().getName());
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void run() {
		System.out.println("Task started by "+ Thread.currentThread().getName());
		does();
		System.err.println("Task finished by "+ Thread.currentThread().getName());
	}
}
