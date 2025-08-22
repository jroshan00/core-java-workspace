package implementingMultiThreading.deadlock.deadlockPrevention;

public class User2 extends Thread {
	String user1;
	String user2;
	String thing;
	public User2() {}
	public User2(String thing,String user1, String user2 ) {
		this.user1=user1;
		this.user2=user2;
		this.thing=thing;
	}
	
	public  void use() {
		
		// Way1:- *Order is same as that of User 1 in nested lock using synchronized method*
		synchronized (user1) {
			System.out.println(thing +" is used by " + user1);
			synchronized (user2){
				System.out.println(thing +" is used by " + user2);
			}
		}
			
		/*  
		 * //Way 2:- *Avoiding nested lock so as to free the resource to available for both user*
		    synchronized (user1){
			System.out.println(thing +" is used by " + user1);
			}
			synchronized (user2){
				System.out.println(thing +" is used by " + user2);
			}
			
			
			//Any other ways are there
			
		 */
	}
	
	@Override
	public void run() {
		super.run();
		use();
	}

}
