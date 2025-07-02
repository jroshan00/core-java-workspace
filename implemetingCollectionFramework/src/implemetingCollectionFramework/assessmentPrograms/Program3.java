package implemetingCollectionFramework.assessmentPrograms;

import java.util.Collection;
import java.util.Vector;

public class Program3 {
	/*
	 * WAJP to create a collection and print all
	 *  the even Integer elements of the collection.
	 */
	public static void main(String[] args) {
		Collection collection=new Vector<>();
		collection.add(1000);
		collection.add(200);
		collection.add(2001);
		collection.add(new Integer(5));
	    collection.add(new Integer(15));
	    collection.add(new Integer(25));
		collection.add(3000);
		collection.add(101);
		collection.add(4);
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
		
		
		//way : 1
		collection.stream().filter(num->num instanceof Integer).filter(nums->(Integer)nums%2==0).forEachOrdered(nums->System.out.println((Integer)nums));
		System.out.println("===================================");
		//way : 2
		for(Object obj:collection) {
			if(obj instanceof Integer nums) {
				if(nums%2==0) {
					System.out.println(nums);
				}
				
			}
		}
		System.out.println("===================================");
		//way 3:
		Object[] elements=collection.toArray();
		for(int i=0;i<elements.length;i++) {
			//if(elements[i].getClass()==new Integer[0].getClass())
			if(elements[i] instanceof Integer) 
			{
				int x=(Integer)elements[i];
				if((x^1)==x+1)
					System.out.println(x);
			}
		}
	}

}
