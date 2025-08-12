package InterviewPrep.numberSeries;

public class Fibonacci {
	public static void main(String[] args){
		fib(5);
	}
	
	public static void fib(int range){
		int num1=0;
		int num2=1;
		int num3=num1+num2;
		if(range==1)
			System.out.println(num1);
		if(range==2)
			System.out.println(num1+" "+num2);
		if(range>=3){
			System.out.print(num1+" "+num2+" "+num3+" ");
			for(int i=0;i<range-3;i++){
				num1=num2;
				num2=num3;
				num3=num1+num2;
				System.out.print(num3+ " ");
			}
		}
	}
}
