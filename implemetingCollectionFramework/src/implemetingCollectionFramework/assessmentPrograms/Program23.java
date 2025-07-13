package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program23 {
	/*
	 * Write a program to identify and print all Unique elements in a List.
	 * 
	 */
	
	//generics type method
	public static <E> List<E> getUniqueElement(List<E> list){
		List<E> result=new ArrayList<>();
		for (E e : list) {
			if(!result.contains(e)) {
				result.add(e);
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);list.add(1);list.add(2);list.add(2);list.add(3);list.add(4);
		list.add(5);list.add(5);list.add(6);list.add(5);list.add(4);list.add(9);
		list.add(2);list.add(7);list.add(8);list.add(9);list.add(6);list.add(9);
		list.add(10);
		
		System.out.println("list having duplicate values : "+ list);
		System.out.println("----------------------");
		System.out.println("list having unique values : "+ getUniqueElement(list));
		
		System.out.println("\n\n============================\n\n");
		
		List<String> list2=new ArrayList<>();
		list2.add("A");list2.add("A");list2.add("B");list2.add("A");list2.add("B");list2.add("C");
		list2.add("D");list2.add("E");list2.add("E");list2.add("E");list2.add("E");list2.add("W");
		
		System.out.println("list having duplicate values : "+ list2);
		System.out.println("----------------------");
		System.out.println("list having unique values : "+ getUniqueElement(list2));
		
		
		
	}

}
