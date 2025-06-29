package usingGenericsInCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayDriver {

		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) {
			
			Collection<Double> c1 = new ArrayList<Double>();
			Collection<Integer> c2 = new ArrayList<Integer>();
			
			// adding values in <Double> parameterized type collection of ArrayList
	        c1.add(100.0);
	        c1.add(200.0);
	        c1.add(300.1);
	        c1.add(12.0);
	        
	        // adding values in <Integer> parameterized type collection of ArrayList
	        c2.add(10);
	        c2.add(20);
	        c2.add(30);
	        c2.add(1);

	        CollectionArray<ArrayList<Integer>> collectionArrayList1=new CollectionArray(c1);
	        System.out.println(collectionArrayList1.getData());
	        CollectionArray<ArrayList<Integer>> collectionArrayList2=new CollectionArray(c2);
	        System.out.println(collectionArrayList2.getData());
		}
		

}
