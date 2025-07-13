package implementingSearchingAlgorithms.binarySearch;

import java.util.Scanner;

public class BinarySearch {
	/*
	 * If the provided array is in sorted order then the binary
	 * search algorithm is used to search the element in array.
	 * 
	 * In binary search algorithm we devide the given array 
	 * in two half and we look for the element in left or  the right side 
	 * of search the element.
	 */
	
	public static int binarySearch(int[] a,int key) {
		int low=0;int high=a.length-1;
		while(low<=high) {
			int mid=low+((high-low)/2);
			if(a[mid]==key) {
				return mid;
			}else if(a[mid]>key){
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array= {12,45,78,98,101,665,487,8779};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target element to be searched : ");
		int target=sc.nextInt();
		int index=binarySearch(array, target);
		System.out.println(target+" is found at index : "+index);
	}

}
