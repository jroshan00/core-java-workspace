package implementingAnonymous.anonymousFunction;

 public interface User {
	 
	 public int add(int a,int b);
	 
	 public default void sayHello() {
		 System.out.println("Hello from lamda!!");
	 }

}
