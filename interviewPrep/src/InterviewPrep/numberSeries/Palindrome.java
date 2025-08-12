package InterviewPrep.numberSeries;

public class Palindrome {
	
	public static void main(String[] args) {
		int num=144441;
		System.out.println(isPalindrome(num)?"Palindrome":"Not Palindrome");
		
	}
	
	public static boolean isPalindrome(int num) {
		int originalNum=num;
		int res=0;
		while(num>0) {
			int rem=num%10;
			res=res*10+rem;
			num/=10;
		}
		return originalNum==res;
	}

}
