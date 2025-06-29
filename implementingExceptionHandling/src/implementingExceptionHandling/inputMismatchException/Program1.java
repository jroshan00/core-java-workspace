package implementingExceptionHandling.inputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		int y=0;
		try {
			System.out.println("Enter the first number : ");
			try {
				x=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println(x + " is divided by " +y + " -> " +(int)x/y);
			}
			System.out.println("Enter the second number : ");
			y=sc.nextInt();
			System.out.println(x + " is divided by " +y + " -> " +x/y);
		}catch(ArithmeticException e) {
			System.out.println("Result is infinity");
			System.out.println(e.getMessage());
		}
		System.out.println(x + " is multiplied by " +y + " -> " +x*y);
		System.out.println("----------Program Ends----------");
		
	}

}
