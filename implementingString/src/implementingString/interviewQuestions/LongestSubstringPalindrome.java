package implementingString.interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check : ");
		String str=sc.nextLine();
		str=longestPalindrome(str);
		System.out.println("Longest Palindrome substring is : "+str);
	}

	private static String longestPalindrome(String s) {
		if (s.length() <= 1)
			return s;
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i <= s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);
				if (isPalindrome(str))
					map.put(str, str.length());
			}
		}
		Set<String> values = map.keySet();
		int max = Integer.MIN_VALUE;
		for (String str : values) {
			if (str.length() > max) {
				max = str.length();
			}
		}
		for (String str : map.keySet()) {
			if (map.get(str) == max) {
				return str;
			}
		}
		return max + "";

	}

	private static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str.trim());
		sb.reverse();
		return sb.toString().equalsIgnoreCase(str);
	}

}
