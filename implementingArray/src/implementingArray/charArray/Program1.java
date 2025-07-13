package implementingArray.charArray;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of char array : ");
		int x=sc.nextInt();
		char[] c=new char[x];
		Arrays.fill(c, '\0');
		for (int i = 0; i < c.length; i++) {
			c[i]=1;
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
