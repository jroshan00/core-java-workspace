package implementingString.problemSeries;

public class Program57 {
	/*
	 * WAJP to take a String input and print all the indexes where space characters
	 * are present in the String.
	 * 
	 */

	public static void printSpaceCharIndex(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				System.out.println("space is at index : " + i);
			}
		}
	}

	public static void main(String[] args) {
		String string = "01\s3 5 789\s";
		printSpaceCharIndex(string);

	}

}
