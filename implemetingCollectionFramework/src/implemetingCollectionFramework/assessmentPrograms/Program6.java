package implemetingCollectionFramework.assessmentPrograms;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Collectors;

public class Program6 {
	public static void main(String[] args) {
		/*
		 * WAJP to create a collection and calculate sum of all the integer elements of collection.
		 */
		Collection<Integer> collection=new Vector<>();
		collection.add(101);
		collection.add(4);
		collection.add(5135);
		collection.add(1115);
		collection.add(325);
		collection.add(415);
		collection.add(65465);
		collection.add(45);
		collection.add(6);
		collection.add(65);
		
		//Way : 1
		System.out.println("=================");
		int sum=0;
		Iterator<Integer> itr=collection.iterator();
		while(itr.hasNext()) {
			sum=sum+itr.next();
		}
		System.out.println("Total sum is : "+sum);
		
		//Way : 2
		System.out.println("=================");
		sum=0;
		sum=collection.stream().collect(Collectors.summingInt(n->n));
		System.out.println("Total sum is : "+sum);
		
		//Way : 3
		System.out.println("=================");
		sum=0;
		for(int i=0;i<collection.size();i++) {
			sum=sum+collection.toArray(new Integer[0])[i]; 
		}
		System.out.println("Total sum is : "+sum);
	}

}
