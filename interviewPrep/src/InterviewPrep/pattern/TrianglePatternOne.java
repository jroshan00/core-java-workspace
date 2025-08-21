package InterviewPrep.pattern;

import java.util.Scanner;

public class TrianglePatternOne {
	/*
		 Q. WAJP to print the following pattern
		 
			   *
		     * *
		   * * *
		 * * * *
	 
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int x=sc.nextInt();
		printPattern(x);
	}

	public static void printPattern(int n) {
		int star = 1;
		int space = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print(" *");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}
