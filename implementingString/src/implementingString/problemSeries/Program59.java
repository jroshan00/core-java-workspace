package implementingString.problemSeries;

import java.util.Scanner;

public class Program59 {
	/*
	 * WAJP to check if a string contains only digits.
	 */
	static Scanner sc = new Scanner(System.in);

	public static boolean containsDigits(String str) {
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (c >= '0' && c <= '9') {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the string value  : ");
		String str = sc.nextLine();
		System.out.println(containsDigits(str) ? str + ": contains digit " : str + ": doesn't contain digit");

	}

}
