package implementingString.problemSeries;

public class Program71 {
//	public static int countWords(String s) {
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			if(i==0 && c!=' ' || c!=' ' && s.charAt(i-1)==' ') {
//				count++;
//			}
//		}
//		return count;
//	}
	
	public static int countWords(String s) {
		return s.trim().split("\s+").length;
	}
	public static void main(String[] args) {
		String s="   Mohan Singh Rauniyar";
		System.out.println(countWords(s));
		
	}

}
