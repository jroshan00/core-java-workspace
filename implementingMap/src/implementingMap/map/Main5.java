package implementingMap.map;

import java.util.Set;

public class Main5 {
	
	public static void main(String[] args) {
		System.out.println("==========================");
		MyMap<Integer,Integer> map=new MyHashMap<>();
		map.put(101,654648643);
		map.put(102,654648645);
		map.put(103,654648649);
		map.put(104,654648640);
		map.put(104,999999999);
		Set<MyMap.MyEntry<Integer,Integer>> entrySet=map.entrySet();
		for(MyMap.MyEntry<Integer,Integer> entry:entrySet) {
			System.out.println(entry);
		}
		
		System.out.println("==============================");
		
		Set<Integer> keySet=map.keySet();
		for(Integer i:keySet) {
			System.out.print(i+" ");
		}
	}

}
