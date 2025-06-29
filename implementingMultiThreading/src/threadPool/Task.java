package threadPool;

public class Task extends Thread {
	String task;
	
	public Task() {}
	
	public Task(String task) {
		this.task=task;
		//System.out.println(task+ " : task is Initialized by : " + Thread.currentThread().getName() + " Thread");
		
	}
	
	@Override
	public void run() {
		super.run();
		task();
		
	}
	
	public void task() {
		System.out.println(task+ " is executed by : " + Thread.currentThread().getName()+ " and having priority : " + Thread.currentThread().getPriority());
		}
	

}
