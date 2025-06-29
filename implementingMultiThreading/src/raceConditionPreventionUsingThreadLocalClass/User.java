package raceConditionPreventionUsingThreadLocalClass;

import java.lang.ThreadLocal;
public class User extends Thread {
	/*
	 * instances are typically private static fields  
	 * in classes that wish to associate state with a thread
	 */
	UserOperations operation;
	private static ThreadLocal<Integer> t= new ThreadLocal<Integer>();
	
//	public User(String a) {
//		
//	}
	
	public User(Integer userId) {
		operation.userId=userId;
	}
	
	@Override
	public void run() {
		try {
			
			for(int i=1;i<=1000;i++)
				//operation.userId++;
				t.set(operation.userId++);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			t.remove();
		}
		super.run();
	}
	 

}
