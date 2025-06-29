package implementingString.splitMethod;

public class Program2 {
	public static void main(String[] args) {
		String s="D:\1\0\5";
		/*
		 * 	String[] str=s.split("\\");
		 *  It will throw java.util.regex.PatternSyntaxException
		 *  
		 *  Explaination :
		 *  
		 *  You need four backslashes (\\\\) in the split() argument:
		 *  in the string to represent a single backslash
		 *  Another for regex escaping (\ is also a regex metacharacter)
		 *  That's why split("\\\\") is correct.
		 *  
		 */
		String[] str=s.split("\\");
		System.out.println("String[] length : "+str.length);
		for (int i = 0; i < str.length; i++) {
			String string = str[i];
			System.out.println(string);
		}
		System.out.println(s);
	}
}
