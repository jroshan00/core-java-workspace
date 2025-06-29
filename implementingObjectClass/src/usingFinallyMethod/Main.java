package usingFinallyMethod;

public class Main {
	public static void main(String[] args) {
		Fruit fruit=new Fruit();
		fruit.setCategory("Apple");
		fruit.setPrice(120.5);
		System.gc();
		System.out.println("======MAIN ENDS======");
		fruit=null;
		System.gc();
	}
}
