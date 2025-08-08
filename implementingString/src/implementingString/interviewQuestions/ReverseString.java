package implementingString.interviewQuestions;

public class ReverseString {
	public static void main(String[] args) {
		String str="Hello";
		str=reverse(str);
		System.out.println(str);                              
	}
	
	public static String reverse(String str) {
		char[] ch=str.toCharArray();
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			char c=ch[i];
			result=result+c;
		}
		return result;
	}

}
