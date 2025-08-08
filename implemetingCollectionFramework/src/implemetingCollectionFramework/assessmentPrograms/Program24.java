package implemetingCollectionFramework.assessmentPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program24 {
	/*
	 * Write a program to identify and print all Unique elements in a Array.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] nums={1,2,3,6,5,4,56,8,44,74,99,8,77,9,9,9,87,4,5,66,8,455666,4,46,44,98,7,5,7};
		nums=printUniqueValueOfArray(nums);
		for(int i:nums) {
			System.out.print(i+" ");
		}
		
	}
	
	public static int[] printUniqueValueOfArray(int[] array) {
		Set<Integer> set=new LinkedHashSet<>();
		for(int i:array) {
			set.add(i);
		}
		int[] result=new int[set.size()];
		int index=0;
		for(int num:set) {
			result[index++]=num;
		}
		return result;
	}

}
