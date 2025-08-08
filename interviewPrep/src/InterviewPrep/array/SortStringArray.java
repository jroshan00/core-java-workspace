package InterviewPrep.array;

//import java.util.Arrays;

public class SortStringArray {
	public static void main(String[] args) {
		String[] cars = { "Tata", "Mahindra", "BMW", "SUZUKI" };
		System.out.println("Before sorting : ");
		for (String car : cars) {
			System.out.print(car + " ");
		}

//		System.out.println("\n===========================");
//		Arrays.sort(cars);
//		System.out.println("After sorting : ");
//		for (String car : cars) {
//			System.out.print(car+" ");
//		}
//			
		System.out.println("\n=====================");

		bubbleSort(cars);
		System.out.println("After sorting : ");
		for (String car : cars) {
			System.out.print(car + " ");
		}
	}

	public static void bubbleSort(String[] str) {
		for (int i = 0; i < str.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < str.length - 1 - i; j++) {
				if ((str[j].compareTo(str[j + 1])) > 0) {
					swap(str, j, j + 1);
					count++;
				}
			}
			if (count == 0) {
				return;
			}
		}
	}

	public static void swap(String[] str, int i, int j) {
		String temp = str[j];
		str[j] = str[i];
		str[i] = temp;
	}

}
