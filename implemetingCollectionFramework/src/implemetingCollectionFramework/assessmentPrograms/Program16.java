package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program16 {
	/*
	 * Write a program to store all the prime numbers up to a given range in a List.
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

	public static List<Integer> getSumOfPrime(List<Integer> list) {
		List<Integer> primeList = new ArrayList<Integer>();
		for (Integer integer : list) {
			if (isPrime(integer)) {
				primeList.add(integer);
			}
		}
		return primeList;
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
		System.out.println("List of prime numbers in given list : " + getSumOfPrime(list));
	}

}
