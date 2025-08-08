package implementingMap.examplesOnMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayHighFreqElement {

	public static void main(String[] args) {
		int[] nums= {1,1,1,1,4,4,4,4,5,6,5,57,8,9,9,7};
		highFrequencyElememt(nums);
	}
	
	public static void highFrequencyElememt(int[] nums) {
		Map<Integer, Integer> arrayValFreq=new HashMap<>();
		int highfreq=Integer.MIN_VALUE;
		int element=0;
		for(int x:nums) {
			arrayValFreq.put(x, arrayValFreq.getOrDefault(x, 0)+1);
		}
		Set<Map.Entry<Integer,Integer>> setVal= arrayValFreq.entrySet();
		
		for (Map.Entry<Integer, Integer> entry : setVal) {
			if(entry.getValue()>highfreq){
				highfreq=entry.getValue();
				element=entry.getKey();
			}
		}
		System.out.println(element+" is having highest freq of "+ highfreq);
	}



}
