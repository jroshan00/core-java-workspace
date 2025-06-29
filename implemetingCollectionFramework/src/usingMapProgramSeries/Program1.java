package usingMapProgramSeries;

import java.util.HashMap;
import java.util.Map;

public class Program1 {
	public static void main(String[] args) {
		/*
		 * WAJP to calculate the frequency of the key in a Map
		 */
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Map<Integer,Integer> map1=new HashMap<>();
		map1.put(1,1);
		map1.put(2,1);
		map1.put(3,1);
		map1.put(4,1);
		map1.put(5,1);
		map1.put(6,1);
		
		for(int i=0;i<arr.length;i++) {
			int v=map1.getOrDefault(arr[i],0);
			map1.put(arr[i],v+1);
		}
		System.out.println(map1);
		
		
		
	}

}
