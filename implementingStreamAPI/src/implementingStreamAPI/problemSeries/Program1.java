package implementingStreamAPI.problemSeries;

import java.util.Collection;
import java.util.Vector;

public class Program1 {
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
		/*
		 * doWhile() is intermediate method used in ordered stream to stop the flow of data 
		 * which matches the condition provided while overrinding 
		 * test() method of Predicate @FunctionalInterface
		 */
		collection.stream().sorted().dropWhile(n->n%2==0).forEach(n->System.out.println(n));
		System.out.println("============================");
		
		/*
		 * filter() Returns a stream consisting of the elements of this stream 
		 * that match the given predicate provided while overrinding 
		 * test() method of Predicate @FunctionalInterface
		 */
		collection.stream().sorted().filter(n->n%2==0).forEach(n->System.out.println(n));
		
	}

}
