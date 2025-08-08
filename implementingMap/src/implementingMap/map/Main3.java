package implementingMap.map;

import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		MyMap<Integer,Integer> map1=new MyHashMap<>();
		map1.put(101,654648644);
		map1.put(102,654648648);
		map1.put(103,654648641);
		map1.put(104,654648646);
		
		Set<MyMap.MyEntry<Integer,Integer>> entrySet=map1.entrySet();
		for(MyMap.MyEntry<Integer,Integer> entry:entrySet) {
			System.out.println(entry);
		}
		
		System.out.println("==========================");
		
		MyMap<Integer,Integer> map2=new MyHashMap<>();
		map2.put(105,654648643);
		map2.put(106,654648645);
		map2.put(107,654648649);
		map2.put(108,654648640);
		
		map1.putAll(map2);
		for(MyMap.MyEntry<Integer,Integer> entry:entrySet) {
			System.out.println(entry);
		}
		
		

	}

}
