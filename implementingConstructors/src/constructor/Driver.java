package constructor;

public class Driver {

	public static void main(String[] args) {
//		ConstructorOverloading s0= new SampleClass("Deeee");
//		ConstructorOverloading s1= new SampleClass("Rosha",25);
//		ConstructorOverloading s2= new SampleClass("Ritik",24,175);
//		ConstructorOverloading s3= new SampleClass("Rohan",23,167,"XYZ COLONY");
//		
//		ConstructorChaining s0= new ConstructorChaining("Rajib");
//		ConstructorChaining s1= new ConstructorChaining("Ranjan",25);
//		ConstructorChaining s2= new ConstructorChaining("Kasish",24,175);
//		ConstructorChaining s3= new ConstructorChaining("Joackey",23,167,"XYZ COLONY");

		ConstructorChaining s0= new ConstructorChaining("Rajib");
		CopyConstructor ss0= new CopyConstructor(s0);
		
		ConstructorChaining s1= new ConstructorChaining("Ranjan",25);
		CopyConstructor ss1= new CopyConstructor(s1);
		
		ConstructorChaining s2= new ConstructorChaining("Kasish",24,175);
		CopyConstructor ss2= new CopyConstructor(s2);
		
		ConstructorChaining s3= new ConstructorChaining("Joackey",23,167,"XYZ COLONY");
		CopyConstructor ss3= new CopyConstructor(s3);
		
		System.out.println("______________________________________");
		System.out.println(ss0);
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		System.out.println("______________________________________");
		System.out.println(ss0.getDetails());
		System.out.println(ss1.getDetails());
		System.out.println(ss2.getDetails());
		System.out.println(ss3.getDetails());	
		System.out.println("__________________Start Ends_____________");
	}

}
