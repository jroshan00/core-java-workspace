package usingMapProgramSeries;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	
	public static void wordFrequency(String str){
		String[] s=str.split("\s+");
		Map<String,Integer> m=new HashMap<>();
		for(String i:s){
			int val=m.getOrDefault(i,0);
			m.put(i,val+1);
		}
		m.forEach((key,i)->System.out.println(key + " is " + i + " times"));
	}
	public static void main(String[] args) {
		String s="Mohan Sohan Rohan John   Gandhi Mohan Sohan";
		wordFrequency(s);
	}

}
