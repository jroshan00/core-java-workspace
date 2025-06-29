package implementingString.problemSeries;

public class Program3 {

	public static void main(String[] args) {
		//Q. What will be output:
		String s1=null;
		System.out.println(s1.length());
		
		/*
		 * Ans. It will through NullPointerException
		 * 
		 * Reason : As s1 is refering to null
		 * So,object s1 being null couldn't load length() method
		 */
	}

}
