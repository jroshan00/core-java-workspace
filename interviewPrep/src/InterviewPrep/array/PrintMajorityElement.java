package InterviewPrep.array;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class PrintMajorityElement {
	/*
	 * Find majority element of the given array.
	 * Condition :  It is guaranted that there is at least one majority element in array.
	 * 
	 */
	public static void main(String[] args) {
		int nums[] = {1,1,1,1,2,8};
		int major=majorityElement(nums);
		System.out.println("majority element is "+ major );
	}
	
	public static int majorityElement(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i : nums) 
			map.put(i, map.getOrDefault(i,0)+1);
		Set<Integer> keys=map.keySet();
		for(int key:keys) {
			if(map.get(key)>nums.length/2) {
				return key;
			}
		}
		return -1;
	}

}
