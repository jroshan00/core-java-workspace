package InterviewPrep.numberSeries;

public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		int a=15;
		int b=25;
		System.out.println("Before swapping...");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("After swapping...");
		swap(a,b);
	}
	
	public static void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
