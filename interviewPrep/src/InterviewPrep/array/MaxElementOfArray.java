package InterviewPrep.array;

import java.util.Arrays;

public class MaxElementOfArray {
	/**
	 * Best Solution for finding max element : 
	 * 
	 * Average Case : O(n)
	 * Worst Case : O(n)
	 * Best Case : O(1)
	 * 
	 * @since 7/30/2025
	 */
	public static int maxElementOfArrayAlgo1(int[] nums) {
		int max=nums[0];
		for(int n:nums) {
			if(n>max)
				max=n;
		}
		return max;
	}
	
	/**
	 * 
	 * Avearge Case : O(n log n)
	 * Worst Case : O(n log n)
	 * Best Case : O(n log n)
	 * 
	 */
	public static int maxElementOfArrayAlgo2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length-1];
	}
	
	/*
	 * Using Optimized Bubble Sort Algoithtm
	 * 
	 * Avearge Case : O(n*n)
	 * Worst Case : O(n*n)
	 * Best Case : O(n*n)
	 * 
	 */
	public static int maxElementOfArrayAlgo3(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			int count=0;
			for(int j=i+1;j<nums.length-1-i;j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
			if(count==0)
				break;
		}
		return nums[nums.length-1];
	}
	
	/*
	 * Using Selection Sort Algorithm
	 * 
	 * Avearge Case : O(n*n)
	 * Worst Case : O(n*n)
	 * Best Case : O(n*n)
	 * 
	 */
	public static int maxElementOfArrayAlog4(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int key=i;
			for(int j=i;j<nums.length;j++) {
				if(nums[key]>nums[j])
					key=j;
			}
			int temp=nums[i];
			nums[i]=nums[key];
			nums[key]=temp;
		}
		return nums[nums.length-1];
	}
	
	public static void main(String[] args) {
		int[] nums= {2,8,7,9,6,3,2,5,4,7,88,9,9,8,99,85,5,28,4,56,85,45,65};
		System.out.println("Max element : "+maxElementOfArrayAlgo1(nums));
		System.out.println("Max element : "+maxElementOfArrayAlgo2(nums));
		System.out.println("Max element : "+maxElementOfArrayAlgo3(nums));
		System.out.println("Max element : "+maxElementOfArrayAlog4(nums));
	}

}
