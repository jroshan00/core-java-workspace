package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program15 {
	/*
	 * Write a program to get sum of all the prime numbers available in a List.
	 */

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

	public static int getSumOfPrime(List<Integer> list) {
		int sum = 0;
		for (Integer integer : list) {
			if (isPrime(integer)) {
				System.out.println(integer);
				sum = sum + integer;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(12);
		list.add(2);
		list.add(1);
		list.add(62);
		list.add(9);
		list.add(7);
		list.add(3);
		System.out.println("Sum of prime numbers in given list : " + getSumOfPrime(list));
	}

}
