package implementingSearchingAlgorithms.binarySearch;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
	public static int binarySearch(int[] a, int target, int low, int high) {
		if (low <= high) {
			int mid = low + ((high - low) / 2);
			if (a[mid] == target) {
				return mid;
			} else if (a[mid] > target) {
				return binarySearch(a, target, low, mid - 1);
			} else {
				return binarySearch(a, target, mid + 1, high);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 12, 45, 78, 98, 101, 665, 487, 8779 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target element to be searched : ");
		int target = sc.nextInt();
		int index = binarySearch(array, target, 0, array.length-1);
		System.out.println(target + " is found at index : " + index);
		sc.close();
	}
}
