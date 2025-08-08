package InterviewPrep.array;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RotateAnArray {
	/*
	 * Problem: Rotate an array of n elements to the right by k steps. 
	 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
	 * How many differen ways do you know to solve this problem?
	 * 
	 */
	public static void main(String[] args){
		int[] nums={1,2,3,4,5,6,7};
		for(int x:nums){
			System.out.print(x+" ");
		}
		System.out.println("\n===============");
		rotate(nums,3);
		for(int x:nums){
			System.out.print(x+" ");
		}
		
	}
	
	//Solution 1
	
	/*
	public static int[] rotate(int[] nums,int k){
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			 list.add(nums[i]);
		}
		Collections.rotate(list,k);
		for(int i=0;i<nums.length;i++){
			nums[i]=list.get(i);
		}
		return nums;
	}
	*/
	
	//Solution 2
	
	/*
	public static void rotate(int[] nums,int k) {
		if(k>nums.length) {
			k=k%nums.length;
		}
		for(int i=0;i<k;i++){
			for(int j=nums.length-1;j>0;j--){
				int temp=nums[j-1];
				nums[j-1]=nums[j];
				nums[j]=temp;
			}
		}
	}
	*/
	
	//Solution 3
	
	/*
	public static void rotate(int[] nums,int k){
		int len=nums.length;
		int[] result=new int[len];
		int j=len-1;
		for(int i=1;i<=k;i++){
			result[k-i]=nums[j--];
		}
		for(int i=k,p=0;i<nums.length;i++){
			result[i]=nums[p++];
		}
		//System.arraycopy( result, 0, nums, 0, nums.length );
		for(int i=0;i<nums.length;i++){
			nums[i]=result[i];
		}
	}

	*/
	
	public static void rotate(int[] nums,int order){
		if(order<0 || nums.length==0) {
			throw new IllegalArgumentException();
		}
		if(order==0) {
			return;
		}
		int a=nums.length-order;
		reverse(nums,0,a-1);
		reverse(nums,a,nums.length-1);
		reverse(nums,0,nums.length-1);
	}
	
	public static void reverse(int[] nums,int left,int right){
		while(left<right){
			int temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}
}
