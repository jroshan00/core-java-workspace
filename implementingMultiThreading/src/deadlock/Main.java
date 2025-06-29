package deadlock;

public class Main {
	public static void main(String[] args) {
		String name1="Book";
		String name2="Pen";
		String r1="Rohan";
		String r2="Soan";
		
		User1 t1=new User1(name1,r1,r2);
		User2 t2=new User2(name2,r1,r2);
		
		t1.start();
		t2.start();
		
		
		System.out.println("-------MAIN EXIT-------");
		
	}

}
