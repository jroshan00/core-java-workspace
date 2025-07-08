package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class Program9 {
	/*
	 * WAJP to create a collection and print the largest String 
	 * and smallest String available in collection.
	 * 
	 */
	
	public static void main(String[] args) {
		Collection<String> list=new ArrayList<>();
		list.add("Mohan");
		list.add("Sohan");
		list.add("Rohan");
		list.add("Arun");
		list.add("Aravind");
		list.add("Manmohan");
		list.add("Karan");
		list.add("Arjun");
		
		
		// way 1 :
		Iterator<String> itr=list.iterator();
		String largestString="";
		String smallestString=list.toArray(new String[0])[0];
		while (itr.hasNext()){
			String str = (String) itr.next();
			if(str.length()>largestString.length()) {
				largestString=str;
			}else if(str.length()<smallestString.length()) {
				smallestString=str;
			}
		}
		System.out.println("Maximum length String  of collection :  "+largestString);
		System.out.println("Minimum length String  of collection :  "+smallestString);
		
		//way 2 :
		largestString= list.stream().sorted().max(Comparator.comparing(n->n.toString().length())).get();
		smallestString= list.stream().min(Comparator.comparing(n->n.toString().length())).get();
		System.out.println("Maximum length String  of collection :  "+largestString);
		System.out.println("Minimum length String  of collection :  "+smallestString);
	} 

}
