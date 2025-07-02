package implemetingCollectionFramework.assessmentPrograms;

import java.util.Collection;
import java.util.Vector;
import java.util.Iterator;

public class Program2 {
	public static void main(String[] args) {
		//WAJP to create a collection and print all the Integer
		//elements of the collection.
		
		Collection collection=new Vector<>();
		collection.add(10);
		collection.add(20);
		collection.add(new Integer(5));
	    collection.add(new Integer(15));
	    collection.add(new Integer(25));
		collection.add(30);
		collection.add(40);
		collection.add(11.325);
		collection.add(21.325);
		collection.add(31.325);
		collection.add(41.325);
		collection.add("Hello");
		collection.add("i");
		collection.add(5.0f);
		collection.add('@');
		collection.add(true);
		collection.add("false");
		
		//Way 1 : using iterator
		
		Iterator itr=collection.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			if(obj instanceof Integer){
				System.out.print((Integer)obj+" ");
			}
		}
		System.out.println();
		
		/*
		 * Way 2: using for loop

		Object[] elements = collection.toArray();

        System.out.println("Printing Integer elements using toArray():");
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] instanceof Integer) {
                System.out.println((Integer) elements[i]);
            }
        }
        
		*
		*/
		
		/*
		 * Way 3: Using enhanced for loop

		System.out.println("Printing only Integer elements from collection:");
        for (Object obj : collection) {
            if (obj instanceof Integer) {
                System.out.println((Integer) obj);
            }
        }
        
		*/
		/*
		 * Way 4 : Using stream() and forEach()
		 
		 */
		collection.stream().filter(n -> n instanceof Integer).forEach(n->System.out.print((Integer)n+" "));
	}

}
