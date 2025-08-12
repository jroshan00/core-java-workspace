package InterviewPrep.numberSeries;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=123;
		System.out.println("sum of digits of : "+num+" is "+sumOfDigits(num));
		
	}
	
	public static int sumOfDigits(int num) {
		int sum=0;
		
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return sum;
	}

}
