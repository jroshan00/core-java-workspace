package usingMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MethodOfMap {

	public MethodOfMap() {}
	public static void main(String[] args) {
		Map<String,Integer> m1=new HashMap<>();
		String p1=new String("Nike");
		String p2=new String("ParkAvenue");
		String p3=new String("Reebok");
		String p4=new String("Puma");
		String p5=new String("Cobb");
		String p6=new String("RedTape");
		String p7=new String("Sparky");
		m1.put(p1,1645);
		m1.put(p2,2544);
		m1.put(p3,3455);
		m1.put(p4,4654);
		m1.put(p5,5454);
		m1.put(p6,6455);
		m1.put(p7,7745);
		
		/*
		 * Set<>
		 * This method returns all the keys of the of map as set view
		 */
		System.out.println("------------------------------");
		Set<String> keys=m1.keySet();
		System.out.println(keys);
		
		/*
		 * Collection<V> values();
		 * This method will returns from the map
		 * 	 
		 */
		System.out.println("------------------------------");
		Collection<Integer> c1=m1.values();
		System.out.println(c1);
		
		/*
		 * Set<Mao.Entry<K,V>> entrySet();
		 * Returns a set of Entries
		 */
		System.out.println("------------------------------");
		Set<Map.Entry<String,Integer>> ent=m1.entrySet();
		System.out.println(ent);
		
		/*
		 * getOrDefault(key,defaultValue);
		 * 
		 * This method will return the value associated with the specified key,
		 * or the  default value if the key is found in the Map
		 * 
		 */
		System.out.println("------------------------------");
		System.out.println(m1.getOrDefault("Puma",0));
		System.out.println(m1.getOrDefault("Sparks",0)); //Will return 0 instead null
		System.out.println(m1.get("Sparks")); //Will return Null
		
		/*
		 * putIfAbscent(key,value);
		 * 
		 * This method will not add if the provided key is found in the Map
		 * 
		 */
		
		/*
		 * remove(key,value);
		 * This method will remove the entry if key value are exactly a match
		 */
		
		System.out.println("------------------------------");
		m1.remove("Puma",23551);
		System.out.println(m1);
		
		/*
		 * replace(key,newValue,oldValue);
		 * This method will replace only if the provided key and old value matches.
		 */
		System.out.println("------------------------------");
		m1.replace("Puma",32164,4654);
		System.out.println(m1);
		
		/*
		 * 
		 * replace(key,value);
		 * It will replace the old value to the new value if the key is found
		 * 
		 */
		
		System.out.println("------------------------------");
		m1.replace("Puma",9999);
		System.out.println(m1);
		
		
		/*
		 * USING forEach() in Map
		 * 
		 * Note: Here the lamda expression can have two variable for example forEach((k,v)->System.out.println());
		 */
		System.out.println("------------------------------");
		m1.forEach((key,value)->System.out.println(m1.get(key)));
		m1.forEach((k,v)->System.out.println(k + " brand has value starting from : " + v));
		
		/*
		 * replaceAll(lamda function)
		 */
		
		m1.replaceAll((k,v)->v+100000);
		System.out.println("----------------------");
		m1.forEach((k,v)->System.out.println("{ "+k+" "+v+" }"));
		
		/*
		 * Map.Entry<I,T> Interface :
		 * Map.Entry<I,T> is the inneer Interface of Map<KEY,VALUE>
		 * 
		 * getKey()
		 * provies key from the entry
		 * 
		 * getValue() 
		 * IT provided values from the entry
		 * 
		 * setValue()
		 * it is used to update values in the entry
		 * 
		 * 
		 * Examples are given below :
		 */
		
		
		/*
		 *Question : How  to use for each loop in Map<key ,value>
		 */
		
		//WAY 1 :
		
		Map<Integer,Integer> map1=new HashMap<>();
		map1.put(1,64);
		map1.put(2,56);
		map1.put(3,69);
		map1.put(4,75);
		map1.put(5,81);
		map1.put(6,12);
		
		Set<Integer> key=map1.keySet();
		System.out.println("---------------way1---------------");
		for(int k:key) {
			 System.out.println("{ "+k+" , "+map1.get(k)+" }");
		}
		
		//Way 2
		
		Set<Map.Entry<Integer,Integer>> entt=map1.entrySet();
		System.out.println("----------way 2-------------");
		for(Map.Entry<Integer,Integer> e : entt) {
			  System.out.println("{ "+e.getKey()+" , "+e.getValue()+" }");
		}
		
		
		System.out.println("----------way 3-------------");
		Iterator<Map.Entry<Integer,Integer>> itr=entt.iterator();
		while(itr.hasNext()){
			Map.Entry<Integer,Integer> e=itr.next();
			System.out.println("{ "+e.getKey()+" , "+e.getValue()+" }");
		}
	}
}
