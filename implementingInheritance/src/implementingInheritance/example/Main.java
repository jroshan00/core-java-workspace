package implementingInheritance.example;

public class Main {
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.example();
		
		System.out.println("======================");
		
		Child c=(Child)new Parent();
		c.example();
		
		System.out.println("======================");
		
		Parent p3=new Child();
		p3.example();
		
	}
}
