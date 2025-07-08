package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program21 {
	/*
	 * Write a program to store all the Fibonacci numbers up to a range in a List.
	 */
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		System.out.println("first "+ "{ "+n+" }"+" Fibonacci numbers :"+fib(n));
	}
	
	public static List<Integer> fib(int n) {
		List<Integer> fibList=new ArrayList<>();
		int first=0;
		fibList.add(0);
		if(n==1) return fibList;
		int second=1;
		fibList.add(1);
		if(n==2) return fibList;
		int third=1;
		fibList.add(1);
		if(n==3) return fibList;
		int count=3;
		for(int i=4;;i++) {
			first=second;
			second=third;
			third=first+second;
			fibList.add(third);
			count++;
			if(count==n) break;
		}
		return fibList;
	}
	
	public static List<Integer> getFibInRange(int low,int high){
		
	}
	

}
