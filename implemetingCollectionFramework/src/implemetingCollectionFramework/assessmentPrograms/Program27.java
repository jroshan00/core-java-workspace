package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program27 {
	/*
	 * WAJP to remove all the duplicates from a List.
	 * 
	 */
	
	public static void main(String[] args) {
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
		System.out.println("before--> "+list);
		list=removeDuplicates(list);
		System.out.println("after--> "+list);
		
	}
	
	public static List<Integer> removeDuplicates(List<Integer> list) {
		return list.stream().distinct().toList();
	}

}
