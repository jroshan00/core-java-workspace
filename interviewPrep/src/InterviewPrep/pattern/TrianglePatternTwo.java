package InterviewPrep.pattern;

import java.util.Scanner;

public class TrianglePatternTwo {
	
	/*

		* * * * * 
		 *     *
		  *   *
		   * *
		    *

	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int x = sc.nextInt();
		printPattern(x);
	}

	public static void printPattern(int n) {
		int star = 1;
		int space1 = 1;
		int space2 = n;
		if(n%2==0) {
			space2=n+1;
		}
		for (int i = 0; i < n; i++) {
			if(i==0) {
				for (int k = 0; k < n; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {
				for (int j = 0; j < space1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < star; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < space2; j++) {
					System.out.print(" ");
				}
				if(i!=n-1) {
					for (int j = 0; j < star; j++) {
						System.out.print("*");
					}
				}
				System.out.println();
				space1++;
				space2 -= 2;
				
			}
		}
	}

}
