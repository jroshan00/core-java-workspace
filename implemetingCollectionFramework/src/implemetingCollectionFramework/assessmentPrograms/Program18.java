package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program18 {
	/*
	 * Write a program to store first n prime numbers in a List and get its sum.
	 * 
	 */
	static Scanner sc = new Scanner(System.in);

	public static boolean isPrime(int x) {
		if (x < 2) {
			return false;
		}
		if (x == 2 || x == 3) {
			return true;
		}
		if (x % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= x; i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> firstNprimeNumebers(int n) {
		int count = 0;
		List<Integer> primeList = new ArrayList<>();
		for (int i = 2;; i++) {
			if (isPrime(i)) {
				count++;
				primeList.add(i);
				if (count == n) {
					break;
				}
			}
		}
		return primeList;
	}

	public static int getSumOfFirstNthPrime(int n) {
		List<Integer> list = firstNprimeNumebers(n);
		int sum = 0;
		for (Integer integer : list) {
			sum = sum + integer;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the value of x :");
		int x = sc.nextInt();
		System.out.println("first " + x + " prime numbers are : " + firstNprimeNumebers(x));
		System.out.println("sum of first " + x + "  prime numbers is : " + getSumOfFirstNthPrime(x));
	}

}
