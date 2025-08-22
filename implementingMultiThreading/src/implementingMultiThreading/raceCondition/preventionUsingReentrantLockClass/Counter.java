package implementingMultiThreading.raceCondition.preventionUsingReentrantLockClass;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Counter {
	int counter1=0;
	int counter2=0;
	public Counter() {}
	Lock lock1=new ReentrantLock();
	Lock lock2=new ReentrantLock();
	public void increment() {
		lock1.lock();
		try {
			counter1++;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		try {
			counter2++;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			lock2.lock();
			lock1.unlock();//if not here infinite till unlocked
			lock2.unlock();//if not here infinite till unlocked
		}
		
		
		
	}
	

}
