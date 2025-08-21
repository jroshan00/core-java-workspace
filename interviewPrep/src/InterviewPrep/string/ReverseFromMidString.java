package InterviewPrep.string;

import java.util.Scanner;

public class ReverseFromMidString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse  :");
		String str = sc.nextLine();
		String res = reverseFromMidString(str);
		System.out.println("Reversed String as per requirement is -> " + res);
	}

	public static String reverseFromMidString(String str) {
		char[] ch = str.toCharArray();
		String partOne = "", partTwo = "";
		int mid = (ch.length) / 2;
		if (str.length() % 2 == 0) {
			for (int i = 0; i < mid; i++) {
				partOne = ch[i] + partOne;
			}
			for (int i = mid; i < ch.length; i++) {
				partTwo = ch[i] + partTwo;
			}
			return partOne + partTwo;
		} else {
			for (int i = 0; i < mid; i++) {
				partOne = ch[i] + partOne;
			}
			for (int i = mid + 1; i < ch.length; i++) {
				partTwo = ch[i] + partTwo;
			}
			return partOne + ch[mid] + partTwo;
		}
	}

}
