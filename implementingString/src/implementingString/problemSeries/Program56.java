package implementingString.problemSeries;

public class Program56 {
	/*
	 * WAJP to take a String input and print all the indexes where numeric
	 * characters are present in the String.
	 * 
	 */

	public static void printNumCharIndex(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				System.out.println(str.charAt(i) + " is at index : " + i);
			}
		}
	}

	public static void main(String[] args) {
		String str = "mohan12sohan45 0";
		printNumCharIndex(str);
	}

}
