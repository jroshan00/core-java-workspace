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
		System.out.println("Enter the range:");
		int range=sc.nextInt();
		System.out.println("Fib series in given range : "+getFibInRange(range));
		
	}
	
	public static List<Integer> getFibInRange(int range){
		List<Integer> list=new ArrayList<>();
		for(int i=1; ;i++) {
			if(fib(i)<=range)
				list.add(fib(i));
			else 
				break;
		}
		return list;
	}
	
	//--> Using recursion 
	public static int fib(int n) {
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

}
