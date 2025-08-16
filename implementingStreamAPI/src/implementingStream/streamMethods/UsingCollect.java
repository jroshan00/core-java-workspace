package implementingStream.streamMethods;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Collectors;

public class UsingCollect {
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
		
		int sum=collection.stream().collect(Collectors.summingInt(n->n));
		System.out.println("Total sum is : "+sum);
	}

}
