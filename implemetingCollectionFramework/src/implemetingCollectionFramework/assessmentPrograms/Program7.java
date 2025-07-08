package implemetingCollectionFramework.assessmentPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Vector;
import java.util.Iterator;

import static java.lang.System.out;

public class Program7 {
	public static void main(String[] args) {
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
		
		//Way 1 
		 out.println("================");
		 Integer max=Arrays.stream(collection.toArray(new Integer[0])).max(Comparator.comparingInt(n->n)).get();
		 Integer min=Arrays.stream(collection.toArray(new Integer[0])).min(Comparator.comparing(n->n)).get();
		 System.out.println("Max element in the collection "+ collection+" is "+max);
		 System.out.println("Min element in the collection "+ collection+" is "+min);
		 
		//Way 2
		out.println("================");
		int max1=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE;
		for(int element:collection) {
			if(element>max1) {
				max1=element;
			}
			else if(element<min1) {
				min1=element;
			}
		}
		System.out.println("Max element in the collection "+ collection+" is :  "+max1);
		System.out.println("Max element in the collection "+ collection+" is :  "+min1);
		
		//Way 3 
		System.out.println("=======================");
		max1=Integer.MIN_VALUE;
		min1=Integer.MAX_VALUE;
		Iterator<Integer> itr=collection.iterator();
		while(itr.hasNext()){
			int element=itr.next();
				if(element>max1) {
					max1=element;
				}
				else if(element<min1) {
					min1=element;
				}
		}
		System.out.println("Max element in the collection "+ collection+" is :  "+max1);
		System.out.println("Max element in the collection "+ collection+" is :  "+min1);
	}

}
