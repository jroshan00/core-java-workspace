package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Program8 {
	/*
	 * WAJP to create a collection of Strings and print the length of each 
	 * String available in collection.
	 */
	public static void main(String[] args) {
		Collection list=new ArrayList<>();
		list.add("Mohan");
		list.add("Sohan");
		list.add("Rohan");
		list.add("Arun");
		list.add("Aravind");
		list.add("Manmohan");
		list.add("Karan");
		list.add("Arjun");
		list.add(315);
		list.add(true);
		list.add('a');
		
		//Way : 1 
		for (Object str : list) {
			if(str instanceof String string)
				System.out.println("Length of "+string+" is "+((String)string).length());
		}
		
		//Way : 2
		System.out.println("==================");
		list.stream().filter(n->n instanceof String).peek(n->System.out.print("Length of "+n+ " is ")).forEach(n->System.out.println(((String)n).length()));
		
		//Way : 3
		System.out.println("==================");
		list.stream().filter(n->n instanceof String).forEach(n->System.out.println("Length of "+n+ " is "+((String)n).length()));
		
		//Way : 4
		System.out.println("===================");
		Iterator itr=list.iterator();
		while (itr.hasNext()) {
			Object object = itr.next();
			if(object instanceof String str) {
				System.out.println(str+" has length : "+str.length());
			}
		}
		
		
	}

}
