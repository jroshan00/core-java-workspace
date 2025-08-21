package InterviewPrep.array;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] nums= new int[] {1,3,2,4};
		Arrays.sort(nums); //{1,2,3,4};
		int target=3;
		int index=binarySearch(nums,target);
		System.out.println("index of element : "+target+" is at "+index);
	}
	
	public static int binarySearch(int[] nums,int target) {
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(nums[mid]==target) {
				return mid;
			}
			if(nums[mid]>target) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return -1;
	}

}
