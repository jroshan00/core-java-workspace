package implementingExceptionHandling.inputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {
	/*
	 * @author : Roshan Pandey
	 * @publisher : 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the first number : ");
			int x = sc.nextInt();
			System.out.println("Enter the second number : ");
			int y = sc.nextInt();
			try {
				System.out.println(x + " is divided by " + y + " -> " + x / y);
			} catch (ArithmeticException e) {
				System.out.println("Result is infinity");
				System.out.println(e.getMessage());
			}
			System.out.println(x + " is multiply by " + y + " -> " + x * y);
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}	
		System.out.println("----------Program Ends----------");

	}

}
