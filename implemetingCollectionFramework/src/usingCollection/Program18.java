package usingCollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Program18 {
	public static void main(String[] args) {
		Collection collection=new Vector<>();
		collection.add(101);
		collection.add(4);
		collection.add(11);
		collection.add(21);
		collection.add(31);
		collection.add(41);
		
		System.out.println("Before : "+collection);
		Iterator itr=collection.iterator();
		while(itr.hasNext()) {
			/*
			 * throw new java.lang.IllegalStateException as cursor is not moved 
			 * forward since initialized. Here, itr.remove() method always remove prev element
			 *  
			 */
			//itr.remove(); 
			itr.next();
			itr.remove();
		}
		System.out.println("After : "+collection);
	}

}
