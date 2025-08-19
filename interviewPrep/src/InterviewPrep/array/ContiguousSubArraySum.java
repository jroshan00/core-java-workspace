package InterviewPrep.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContiguousSubArraySum {
	
	/*
	 * Important points about SubArray and Subset : 
	 * 
	 * Subarray Sum (contiguous elements) → solved with prefix sums + HashMap
	 * Subset Sum (non-contiguous elements, i.e., any combination) → solved with backtracking / recursion (or DP if needed)
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] nums= {1,2,3};
		System.out.print("GIVEN ARRAY - > ");
		Arrays.stream(nums).forEach(i->System.out.print(i+" "));
		System.out.println("\nEnter the target : ");
		int target=sc.nextInt();
		int count=getCountOfSubArraysSum(target,nums);
		System.out.println("TOTAL COUNT OF TARGET AS "+target+" IS "+count);
		sc.close();
	}
	
	/*
	 * Write a java program to get count of contiguous subsets having sum as target given.
	 */
	
	/*
	 * Time Complexity  : O(n^2)
	 * Space Complexity : O(1)
	 */
	public static int getCountOfSubArraysSum(int[] nums,int target) {
		int count=0;
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum=0;
			for(int j=i;j<nums.length;j++) {
				sum=sum+nums[j];
				if(sum==target)
					count++;
			}
		}
		return count;
	}
	
	/*
	 * Time Complexity : O(n)
	 * Space Complexity : O(n) ( map stores prefix sums )
	 */
	public static int getCountOfSubArraysSum(int target,int[] nums) {
		int sum=0;
		int count=0;
		Map<Integer,Integer> map=new HashMap<>();
		
		//Base case 
		map.put(0,1);
		for(int num:nums) {
			sum=sum+num;
			if(map.containsKey(sum-target)){
				count+=map.get(sum-target);
			}
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		return count;
	}
	
	
	
}
