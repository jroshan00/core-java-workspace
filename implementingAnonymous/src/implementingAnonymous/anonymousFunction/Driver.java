package implementingAnonymous.anonymousFunction;

public class Driver {

	public static void main(String[] args) {
		
		//Way : Traditional way
		User user1= new User(){
			@Override
			public int add(int a, int b) {
				return a+b;
			}
			
			//Not mendadtory to override
			@Override
			public void sayHello() {
				System.out.println("Hello from driver!!");
			}
		};
		user1.sayHello();
		System.out.println(user1.add(15, 15));
		
		System.out.println("\n================================\n");
		
		//Way : Using Lamda function/Anonymous function
		User user2=(int a,int b)->{
			return a+b; 
		};
		user2.sayHello();
		System.out.println(user2.add(5,8));

	}

}
