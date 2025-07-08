package implemetingCollectionFramework.assessmentPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Program14 {
	/*
	 * Given an integer n, return the number of prime numbers that are strictly less than n.
	 * Example 1:
	 * Input: n = 10
	 * Output: 4
	 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
	 * 
	 * Example 2:
	 * Input: n = 0
	 * Output: 0
	 * 
	 * Example 3:
	 * Input: n = 1
	 * Output: 0
	 * 
	 */
	static Scanner sc=new Scanner(System.in);
	public static int countPrime(int n) {
		int count=0;
		boolean[] b=new boolean[n];
		Arrays.fill(b, true);
		b[0]=false;
		b[1]=false;
		for(int i=2;i*i<n;i++){
			for(int j=i*i;j<n;j+=i) {
				if(j%i==0)
					b[j]=false;
			}
		}
		for(boolean x:b) {
			if(x)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number upto which prime to be counted :");
		int range=sc.nextInt();
		System.out.println("Total count of prime within given range : "+countPrime(range));
		
	}

}
