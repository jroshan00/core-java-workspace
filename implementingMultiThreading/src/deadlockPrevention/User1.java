package deadlockPrevention;

public class User1 extends Thread{
	
	String user1;
	String user2;
	String thing;
	public User1() {}
	public User1(String thing,String user1, String user2 ) {
		this.user1=user1;
		this.user2=user2;
		this.thing=thing;
	}
	
	public  void use() {
		synchronized (user1) {
			System.out.println(thing +" is used by " + user1);
			synchronized (user2) {
				System.out.println(thing +" is used by " + user2);
			}
			
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		use();
	}

}
