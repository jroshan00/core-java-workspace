package implementingString.problemSeries;

public class Program58 {
	/*
	 * WAJP to take a String input and replace all the space characters from _ in
	 * the String. a)By using replace() method b)Without using replace() method
	 * 
	 */

	// a)By using replace() method
	public static String replaceSpaceWithReplaceMethod(String str) {
		str = str.replace(' ', '_');
		return str;
	}

	// a)By using replace() method
	public static String replaceSpaceWithoutReplaceMethod(String str) {
		char[] ch = str.toCharArray();
		String result = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				ch[i] = '_';
			}
		}
		for (char c : ch) {
			result = result + c;
		}
		return result;
	}

	public static void main(String[] args) {
		String str = " Mohan Singh";
		System.out.println("Before : " + str);
		System.out.println("After replaceSpaceWithReplaceMethod : " + replaceSpaceWithReplaceMethod(str));
		System.out.println("After replaceSpaceWithoutReplaceMethod : " + replaceSpaceWithoutReplaceMethod(str));
	}

}
