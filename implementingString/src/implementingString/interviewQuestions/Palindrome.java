package implementingString.interviewQuestions;


public class Palindrome {
	public static void main(String[] args) {
		String str1="M  a d  am";
		String str3="L  o       l";
		System.out.println(isStrictlyPalindrome(str1)?"Palindrome" :"Not Palindrome");
		System.out.println(isStrictlyPalindrome(str3)?"Palindrome" :"Not Palindrome");
		String str2="Madam";
		System.out.println(isPalindrome(str2)?"Palindrome" :"Not Palindrome");
	}
	
	public static boolean isPalindrome(String str) {
		StringBuilder sb=new StringBuilder(str);
		return str.equalsIgnoreCase(sb.reverse().toString());
	}
	
	public static boolean isStrictlyPalindrome(String str) {
		char[] ch=str.toCharArray();
		String temp="";
		String rtemp="";
		for(char c:ch) {
			if(c!=' ') {
				temp=temp+c;
				rtemp=c+rtemp;
			}
		}
		return rtemp.equalsIgnoreCase(temp);
	}
}
