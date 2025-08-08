package implementingMap.map;

import java.util.Set;

public class Main4 {
	
	public static void main(String[] args) {
		MyMap<Integer,Integer> map1=new MyHashMap<>();
		Set<MyMap.MyEntry<Integer,Integer>> entrySet=map1.entrySet();
		for(MyMap.MyEntry<Integer,Integer> entry:entrySet) {
			System.out.println(entry);
		}
		
		System.out.println("size : "+map1.size());
		
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
		
		System.out.println("size : "+map1.size());
		
		
	}

}
