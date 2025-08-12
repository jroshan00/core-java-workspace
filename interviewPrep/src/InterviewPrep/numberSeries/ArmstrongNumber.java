package InterviewPrep.numberSeries;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int num=153;
		System.out.println(isArmstrong(num)?"Armstrong Number":"Not Armstrong Number");
		
	}

	private static boolean isArmstrong(int num) {
		int res=0;
		int len=(num+"").length(), temp=num;
		while(temp>0) {
			int rem=temp%10;
			res=res+(int)Math.pow(rem,len);
			temp/=10;
		}
		return res==num;	
	}

}
