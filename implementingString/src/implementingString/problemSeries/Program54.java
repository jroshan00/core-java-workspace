package implementingString.problemSeries;

public class Program54 {
	/*
	 * WAJP to take a String input and count all the space characters, uppercase,
	 * lowercase, numeric, special characters in the String.
	 * 
	 */

	public static int countAllCharacters(String string) {
		return string.split("").length;
	}

	public static void main(String[] args) {

		String str = "abc123+-*~!@ ";
		System.out.println("Total count of  space characters, uppercase, lowercase, numeric, special characters : "
				+ countAllCharacters(str));

	}

}
