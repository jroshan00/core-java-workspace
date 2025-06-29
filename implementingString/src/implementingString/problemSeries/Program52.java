package implementingString.problemSeries;

public class Program52 {
	/*
	 * WAJP to take a String input and count all the 
	 * characters(excluding any special characters).
	 * 
	 */
	
//	public static int countCharachtersExcludingSpecialChracters(String s) {
//		return s.trim().split("[0-9]").length;
//	}
	
	public static void main(String[] args) {
		String string="ab123Af15pq";
		String[] str=string.split("[0-9]");
		/*
		 * This splits the string at every digit (0-9), removing the digits and placing the characters between them into an array.
		 * So, the input "ab123Af15pq" gets split at:
		 * '1' → "ab" before it
		 * '2' → "" (empty string between 1 and 2)
		 * '3' → "" (empty between 2 and 3)
		 * '1' → "Af" before it
		 * '5' → "" between 1 and 5
		 * 	→ "pq" after 5
		 */
		System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
		        System.out.println("str[" + i + "] = '" + str[i] + "'");
		}
		System.out.println("======================");
		for (String s : str) {
		    if (!s.isEmpty()) {
		        System.out.println(s);
		    }
		}
	}

}
