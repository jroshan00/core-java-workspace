package usingMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayOperations {
	/*
	 * In Array :
	 * 1) get all unique element
	 * 2) get all duplicate elelments
	 * 3) get the first non-repeating element
	 * 4) get the element with the highest frequency
	 * 5) remove duplicates value
	 */
	
	
	//Q:4
	public static void getHighestFrequencyElement(int[] array){
		Map<Integer,Integer> m=new LinkedHashMap<>();
		for(int x:array) {
			int val=m.getOrDefault(x, 0);
			m.put(x,val+1);
		}
		int maxValueElement=array[0];
		int freq=1;
		for(int k:array) {
			if(m.get(k)>freq) {
				maxValueElement=k;
				freq=m.get(k);
			}
		}
		 System.out.println("MAX FREQ ELEMENT IS  :" + maxValueElement);
	}
	
	
	//Q:5
	public static Integer[] removeDuplicateElement(int[] arr) {
		Map<Integer,Integer> m=new LinkedHashMap<>();
		for(int x:arr) {
			int val=m.getOrDefault(x, 0);
			m.put(x,val+1);
		}
		Integer[] b=new Integer[m.size()];
		int i=0;
		for(int k:m.keySet()){
			b[i++]=k;
		}
		return b;
	}
	
	public static void main(String[] args) {
		int[] array= new int[]{12,18,12,20,18,15,12,17,15,20,20,20,25};
		getHighestFrequencyElement(array);
		Integer[] a=removeDuplicateElement(array);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}

}
