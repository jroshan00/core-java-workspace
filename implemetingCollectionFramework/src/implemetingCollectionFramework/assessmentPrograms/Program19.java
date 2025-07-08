package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program19 {
	/*
	 * Write a program to store first n prime numbers in a List and then access any
	 * prime number in that range.
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

	public static int getNthPrimeNumberIntheRange(int range, int n) {
		List<Integer> list = firstNprimeNumebers(range);
		int counter = 0;
		for (Integer integer : list) {
			counter++;
			if (counter == n) {
				return integer;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Enter the value of range :");
		int range = sc.nextInt();
		System.out.println("Enter the value of Nth position is the range :");
		int position = sc.nextInt();
		System.out.println("{'" + position + "'}" + " position Prime Number in range of " + "{'" + range + "'}"
				+ " first prime numbers is : " + getNthPrimeNumberIntheRange(range, position));
	}

}
