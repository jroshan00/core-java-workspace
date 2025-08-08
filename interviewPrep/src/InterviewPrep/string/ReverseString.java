package InterviewPrep.string;

public class ReverseString {
	public static String reverseStringAlgo1(String str) {
		return new StringBuilder(str.trim()).reverse().toString();
	}
	
	public static String reverseStringAlgo2(String str) {
		char[] ch=str.trim().toCharArray();
		String revStr="";
		for (int i = 0; i < ch.length; i++) {
			revStr=ch[i]+revStr;
		}
		return revStr;
	}
	
	public static String reverseStringAlgo3(String string) {
		String[] str=string.trim().split("");
		String revStr="";
		for (String s:str) {
			revStr=s+revStr;
		}
		return revStr;
	}
	
	public static void main(String[] args) {
		String s1="Hello World";
		System.out.println(s1+" ---after reversing --> "+reverseStringAlgo1(s1));
		System.out.println(s1+" ---after reversing --> "+reverseStringAlgo2(s1));
		System.out.println(s1+" ---after reversing --> "+reverseStringAlgo3(s1));
	}

}
