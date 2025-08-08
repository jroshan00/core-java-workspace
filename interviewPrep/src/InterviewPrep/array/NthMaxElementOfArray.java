package InterviewPrep.array;

import java.util.Arrays;
import java.util.Scanner;

public class NthMaxElementOfArray {
	
	/**
	 * Using QuickSort() algorithm as sort() inbuilt uses QuickSort() Double-Pivot :
	 * 
	 * Avearge Case : O(n log n)
	 * Worst Case : O(n log n)
	 * Best Case : O(n log n)
	 * 
	 */
	public static int nthMaxElementOfArrayAlgo1(int[] nums, int n) {
		Arrays.sort(nums);
		if (n >= nums.length || n <= 0) {
			return -1;
		} else {
			return nums[nums.length - n];
		}
	}
	
	/**
	 * Using CountSort() algorithm :
	 * 
	 * Avearge Case : O(n)
	 * Worst Case : O(n)
	 * Best Case : O(n)
	 * 
	 */
	public static int nthMaxElementOfArrayAlgo2(int[] nums,int n) {
		int max=nums[0];
		int min=nums[0];
		for(int num:nums) {
			if(num>max)
				max=num;
			else if(num<min)
				min=num;
		}
		int freq[]=new int[max-min+1];
		for(int e:nums)
			freq[e-min]++;
		int count=0;
		for(int i=freq.length-1;i>=0;i--) {
			if(freq[i]>0) {
				count++;
				if(count==n)
					return i+min;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		final Scanner sc=new Scanner(System.in);
		int[] nums = { 12, 88, 10, 77, 99, 80, 24, 29, 30, 38, 40, 49, 50, 55, 60, 69, 71, 90 };
		System.out.println("Enter the value of n  :");
		int n = sc.nextInt();
		System.out.println("nth Max Element : " + nthMaxElementOfArrayAlgo1(nums, n));
		System.out.println("nth Max Element : " + nthMaxElementOfArrayAlgo2(nums, n));
	}
}
