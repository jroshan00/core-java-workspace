package implementingString.problemSeries;

public class Program2 {

	public static void main(String[] args) {
		//Q. How many objects are created?
		String s1=new String("HelloWorld"); 
		/*
		 * Ans. Two objects are created
		 * 
		 * Reason : Object is created in Heap Area as well as in SCP using new keyword 
		 * but s1 will be refering to the object data in heap area
		 */
	}

}
