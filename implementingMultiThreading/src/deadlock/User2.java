package deadlock;

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
		synchronized (user2) {
			System.out.println(thing +" is used by " + user2);
			synchronized (user1){
				System.out.println(thing +" is used by " + user1);
			}
			
		}
	}
	
	@Override
	public void run() {
		super.run();
		use();
	}

}
