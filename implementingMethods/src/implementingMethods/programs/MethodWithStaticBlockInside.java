package implementingMethods.programs;

public class MethodWithStaticBlockInside {
	/*
	 * It will be loaded with at Static Method Area particularly in
	 * Constant Pool
	 * 
	 */
	static {
		System.out.println("Class level static block....");
	}
	
	public static void main() {
		int x;
		{
			x=0;
			System.out.println("Inner");
			System.out.println("x : "+x);
		}
		System.out.println("Outer");
		System.out.println("x : "+x);
	}
	
	public static void main(String[] args) {
		main();
		
	}

}
