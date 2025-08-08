package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program25 {
	/*
	 * Write a program to identify and print all duplicate elements in a List.
	 * 
	 */
	
	public static void main(String[] args) {
		/*
		 * If want the list to be immutable,unmodifiable the List.of() can be the option.
		 * It returns an unmodifiable list containing nine elements.
		 * List<Integer> list=List.of(1,1,1,1,1,2,2,2,8,9,6,5,4,3,3,6,5,47,8,9,9,556,56,6,5,56,65,5622,33,66,6,5,55,422);
		 * 
		 * If we will use the above list in the below program then it will give UnsupportedOperationException
		 * beacause we are tring to modify the string.
		 * 
		 */
		List<Integer> list=new ArrayList<>();
		list.add(62);
		list.add(22);
		list.add(82);
		list.add(62);
		list.add(72);
		list.add(62);
		list.add(92);
		list.add(62);
		list.add(22);
		list.add(62);
		list.add(62);
		list.add(95);
		list.add(87);
		list.add(74);
		list.add(2);
		
		System.out.println(list);
		getOnlyDuplicatesElement(list);
		System.out.println(list);
	}
	
	public static List<Integer> getOnlyDuplicatesElement(List<Integer> list){
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(Integer i:list) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		list.clear();
		Set<Integer> keys=map.keySet();
		for(int key: keys) {
			int value=map.get(key);
			if(value>1) {
				list.add(key);
			}
		}
		return list;
		
	}

}
