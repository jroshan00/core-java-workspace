package implemetingCollectionFramework.assessmentPrograms;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Program1 {
	public static void main(String[] args) {
		//WAJP to create a collection and iterate over the collection.
		Collection<Integer> collection=new Vector<>();
		collection.add(10);
		collection.add(20);
		collection.add(30);
		collection.add(40);
		
		Iterator<Integer> itr=collection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()*10);
		}
	}

}
