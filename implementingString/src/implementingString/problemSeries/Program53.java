package implementingString.problemSeries;

public class Program53 {
	/*
	 * WAJP to take a String input and count all the characters(excluding any
	 * special characters).
	 * 
	 */

	public static int countCharachtersExcludingSpecialChracters(String str) {
		String[] s = str.trim().split("[^0-9a-zA-Z]");
		String string = "";
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].toCharArray().length; j++)
				string = string + s[i].toCharArray()[j];
		}
		String[] result = string.split("");
		int count = 0;
		for (String strr : result) {
			if (!strr.isBlank()) {
				count++;
			}
		}
		return count;
	}

//	public static int countCharachtersExcludingSpecialChracters(String str) {
//		int count=0;
//		for (int i = 0; i < str.length(); i++) {
//			char c=str.charAt(i);
//			if(c>='0' && c<='9' || c>='A' && c<='Z' || c>='a' && c<='z' ) {
//				count++;
//			}
//		}
//		return count;
//	}

	public static void main(String[] args) {
		String s1 = "adc@45!*jhhv";
		String s2 = " 123_02()98asd ";
		String s3 = " 123-/\\02*/98asd";
		System.out.println("Total characters in " + s1 + " excluding special character is "
				+ countCharachtersExcludingSpecialChracters(s1));
		System.out.println("Total characters in " + s2 + " excluding special character is "
				+ countCharachtersExcludingSpecialChracters(s2));
		System.out.println("Total characters in " + s3 + " excluding special character is "
				+ countCharachtersExcludingSpecialChracters(s3));

	}
}
