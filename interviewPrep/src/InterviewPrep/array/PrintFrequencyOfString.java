package InterviewPrep.array;

import java.util.*;

public class PrintFrequencyOfString {
	public static void main(String[] args) {
		String str="Mohan is heer mohan is there and mohan is everywhere";
		printFrequencyOfString(str);
		
	}
	
	public static void printFrequencyOfString(String str) {
		Map<String,Integer> freqMap=new HashMap<>();
		String[] temp=str.trim().split("\s+");
		for(String s:temp) {
			int val=freqMap.getOrDefault(s,0);
			freqMap.put(s, val+1);
		}
		
		Set<String> keys=freqMap.keySet();
		for (String string : keys) {
			System.out.println(string + " : - > " +freqMap.get(string));
		}
	}
}
