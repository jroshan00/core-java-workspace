package implementingMap.examplesOnMap;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class ArrayFrequency {
	public static void main(String[] args) {
		int[] nums= {11,22,56,5,5,1,12,2,55,4,2,5,474,8,9,54,5,4,55,45};
		printFrequency(nums);
	}
	
	public static void printFrequency(int[] nums) {
		Map<Integer, Integer> arrayValFreq=new HashMap<>();
		for(int x:nums) {
			arrayValFreq.put(x, arrayValFreq.getOrDefault(x, 0)+1);
		}
		Set<Map.Entry<Integer,Integer>> setVal= arrayValFreq.entrySet();
		
		for (Map.Entry<Integer, Integer> entry : setVal) {
			System.out.println(entry.getKey() + " is " + entry.getValue() +" times");
		}
	}

}
