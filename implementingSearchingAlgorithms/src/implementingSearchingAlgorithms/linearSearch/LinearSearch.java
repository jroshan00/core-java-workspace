package implementingSearchingAlgorithms.linearSearch;

import java.util.Scanner;
public class LinearSearch {
	public static int linearSearch(int[] a, int target) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array= {1,5,87,9,8,854,5,65,6512};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target element to be searched : ");
		int target=sc.nextInt();
		int index=linearSearch(array, target);
		System.out.println(target+" is found at index : "+index);
	}

}
