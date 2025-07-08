package implementingString.problemSeries;

import java.util.Scanner;

public class Program55 {
	/*
	 * WAJP to take a String input and count all the vowel characters in the String.
	 */
	static Scanner sc = new Scanner(System.in);

	public static int countVowels(String string) {
		String[] str = string.trim().split("[^AEIOUaeiou]");
		String result = "";
		for (String string2 : str) {
			if (!string2.isBlank())
				result = result + string2;
		}
		return result.split("").length;
	}

	public static void main(String[] args) {
		System.out.println("Enter a string value :");
		String str = sc.nextLine();
		System.out.println("Total count of  vowel characters : " + countVowels(str));
	}

}
