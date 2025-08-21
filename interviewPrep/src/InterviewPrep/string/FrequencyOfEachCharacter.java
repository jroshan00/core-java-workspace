package InterviewPrep.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachCharacter {
	
	public static void main(String[] args) {
		String str="WELCOME TO 360 DEGREEE";
		printFrequencyOfEachCharacter(str);
		
		System.out.println("\n====================\n");
		str="I AM INTELLIGENT";
		printFrequency(str);
	}
	
	/*
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * 
	 * Where n is length of String
	 */
	
	public static void printFrequencyOfEachCharacter(String str) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
			}
		}
		for(char c : map.keySet()) {
			System.out.println(c+" -> "+map.get(c));
		}
	}
	
	/*
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * 
	 * Where n is length of String
	 */
	
	
	public static void printFrequency(String str) {
		char[] ch =str.trim().toUpperCase().toCharArray();
		int[] freq=new int[128];
		for(char c:ch) {
			freq[c]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0 && i!=' ') {
				System.out.println((char)i+" - > "+freq[i]);
			}
		}
		
	}

}
