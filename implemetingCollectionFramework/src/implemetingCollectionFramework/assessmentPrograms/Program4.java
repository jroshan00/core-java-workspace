package implemetingCollectionFramework.assessmentPrograms;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Program4 {
	public static void main(String[] args) {
		/*
		 * WAJP to create a collection and print all 
		 * the odd Integer elements of the collection.
		 */
		Collection<Integer> collection=new Vector<>();
		collection.add(101);
		collection.add(4);
		collection.add(654);
		collection.add(6846);
		collection.add(31);
		collection.add(4587);
		collection.add(6547);
		
		//way : 1 
		for(int x:collection) {
			if(!((x^1)==(x+1))) {
				System.out.println(x);
			}
		}
		
		//way : 2
		System.out.println("====================");
		collection.stream().filter(n->(Integer)n%2==0).forEach(n->System.out.println(n));
		
		//way : 3
		System.out.println("====================");
		Iterator<Integer> itr=collection.iterator();
		while(itr.hasNext()) {
			int x=itr.next();
			if(x%2==0) {
				System.out.println(x);
			}
		}
		
		//way : 4
		System.out.println("====================");
		Integer[] elements=collection.toArray(new Integer[0]);
		for(int i=0;i<elements.length;i++) {
			if(elements[i]%2==0) {
				System.out.println(elements[i]);
			}
		}
		
	}

}
