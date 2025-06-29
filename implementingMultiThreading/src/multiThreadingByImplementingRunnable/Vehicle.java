package multiThreadingByImplementingRunnable;

public class Vehicle<T,A> implements Runnable{
	T t;
	A a;
	public Vehicle(T t) {
		this.t=t;
	}
	
	public Vehicle(T t,A a) {
		this.t=t;
		this.a=a;
	}
	
	@Override
	public void run() {
		print();
		
	}
	public void print() {
		System.out.println(t);
	}

}
