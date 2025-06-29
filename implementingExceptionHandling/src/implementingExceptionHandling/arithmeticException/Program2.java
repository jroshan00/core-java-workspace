package implementingExceptionHandling.arithmeticException;

import java.util.Scanner;

public class Program2 {
	public static double divide(double a,double b){
		try {
			
			return a/b;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char x;
		do {
			System.out.println("Enter num1 : ");
			int a=sc.nextInt();
			System.out.println("Enter num2 : ");
			int b=sc.nextInt();
			double result=divide(a,b);
			System.out.println("Result is "+ result);
			System.out.println("Enter Y/y to continue : ");
			x=sc.next().charAt(0);
		}while(x=='Y' || x=='y');
	}
		

}
