package implemetingCollectionFramework.assessmentPrograms;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Program10 {
	/*
	 * WAJP to create a collection and remove all the 
	 * elements other than Integer from the collection.
	 * 
	 */
	public static void main(String[] args) {
		Collection c=new Vector<>();
		c.add("Hello");
		c.add('d');
		c.add(12);
		c.add(54);
		
		//Way : 1
		c.stream().filter(n->n instanceof Integer).forEach(n->System.out.println(n));
		
		//Way : 2
		System.out.println("====================");
		for (int i = 0; i < c.size(); i++) {
			if(c.toArray()[i].getClass()==(new Integer(0).getClass())) {
				System.out.println(c.toArray()[i]);
			}
		}
		
		//Way : 3
		System.out.println("=====================");
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer) {
				System.out.println(o);
			}
		}
		
	}

}
