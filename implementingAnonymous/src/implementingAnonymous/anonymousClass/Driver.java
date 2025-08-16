package implementingAnonymous.anonymousClass;

public class Driver {
	
	 public static void main(String[] args) {
		 
		 /*
		  * When we decompile the Driver$1.class using javap Driver$1 we get the following output....
		  * 
		  * Warning: Binary file Driver$1 contains implementingAnonymous.example.Driver$1
		  * Compiled from "Driver.java"
		  * 
		  * class implementingAnonymous.example.Driver$1 extends implementingAnonymous.example.Vehicle {
		  * 
		  * implementingAnonymous.example.Driver$1();
		  * public void start();
		  * 
		  * }
		  * 
		  */
		 System.out.println("=======Creating anonymous innner class ===========");
		 Vehicle v1=new Vehicle(){
			 public void start() {
				 System.out.println("Started already....");
			 }
		 };
		 v1.start();
		 
		 
		 System.out.println("=======Vehicle Object Creation===========");
		 Vehicle v2=new Vehicle();
		 v2.start();
		 
	}

}
