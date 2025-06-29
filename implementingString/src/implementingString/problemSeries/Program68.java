package implementingString.problemSeries;

public class Program68 {
		
		public static boolean isPalindrome(String s) {
			String rev="";
			for(int i=0;i<s.length();i++) {
				rev=s.charAt(i)+rev;
			}
			return rev.equalsIgnoreCase(s);
		}
		public static boolean isPalindrome(Object string) {
			String s=(String)string;
			s=s.toUpperCase();
			int start=0;
			int end=s.length()-1;
			while(start<end){
				if(s.charAt(start)!=s.charAt(end)) {
					return false;
				}
				start++;
				end--;
			}
			return true;
		}
		public static void main(String[] args) {
			String s1="MADAM";
			String s2="Mohan";
			System.out.println(s1+" is palindrome : "+isPalindrome(s1));
			System.out.println(s2+" is palindrome : "+isPalindrome(s2));
			Object o1="MADAM";
			Object o2="Mohan";
			System.out.println(s1+" is palindrome : "+isPalindrome(o1));
			System.out.println(s2+" is palindrome : "+isPalindrome(o2));
		}


}
