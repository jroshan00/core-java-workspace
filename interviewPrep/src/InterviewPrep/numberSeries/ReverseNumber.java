package InterviewPrep.numberSeries;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int  num=1234;
		int res= reverse(num);
		System.out.println(res);
	}
	
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}

}
