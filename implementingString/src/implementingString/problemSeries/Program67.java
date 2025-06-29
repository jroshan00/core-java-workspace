package implementingString.problemSeries;

public class Program67 {
	
	public static String reverseFromFirstIndex(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		return rev;
	}
	
	public static String reverseFromLastIndex(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		String s="mohan";
		System.out.println(s);
		s=reverseFromFirstIndex(s);
		System.out.println(s);
		s=reverseFromLastIndex(s);
		System.out.println(s);
	}

}
