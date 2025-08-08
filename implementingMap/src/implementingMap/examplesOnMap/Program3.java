package implementingMap.examplesOnMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Program3 {
	public static void main(String[] args) {
		Map<Integer,Integer> map1=new HashMap<>();
		map1.put(101,654648644);
		map1.put(102,654648648);
		map1.put(103,654648641);
		map1.put(104,654648646);
		
		Set<Entry<Integer,Integer>> entrySet=map1.entrySet();
		for(Entry<Integer,Integer> entry:entrySet) {
			System.out.println(entry);
		}
		
		System.out.println("==========================");
		
		Map<Integer,Integer> map2=new HashMap<>();
		map2.put(105,654648643);
		map2.put(106,654648645);
		map2.put(107,654648649);
		map2.put(108,654648640);
		
		map1.putAll(map2);
		for(Entry<Integer,Integer> entry:entrySet) {
			System.out.println(entry);
		}
		
		

	}

}
