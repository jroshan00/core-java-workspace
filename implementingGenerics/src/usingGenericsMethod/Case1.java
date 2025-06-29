package usingGenericsMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Case1 {
	
	//Any type of Collection is is accepted here
	public static void print(Collection<?> t) {
		System.out.println(t);
	}

	public static void eat(List<?> l) {
		
		System.out.println("random list");
		
	}

	public static void main(String[] args) {
		
		System.out.println("------------Example 1--------------");
		
		Collection<Integer> c1= new ArrayList<>();
		Collection<Double> c2= new ArrayList<>();
		Collection<String> c3= new ArrayList<>();
		
		c1.add(1); c1.add(2); c1.add(3); c1.add(4);
		c2.add(1.2); c2.add(2.0); c2.add(3.8); c2.add(4.4);
		c3.add("Rohan"); c3.add("Mohan"); c3.add("Hero"); c3.add("King");
		
		Case1.print(c1);
		Case1.print(c2);
		Case1.print(c3);
		
		System.out.println("------------Example 2--------------");
		
		List<Integer> l1= new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		List<String> l2= new ArrayList<>();
		l2.add("Sandwitch");
		l2.add("Burger");
		l2.add("Samosa");
		l2.add("Pizza");
		l2.add("Noodles");
		
		System.out.println("Before applying remove() method : " + l1);
		l1.remove(0);
		System.out.println("After applying remove() method : " + l1);
		System.out.println("Output of -> l1.containsAll(l2) is : "+l1.containsAll(l2));
		
	}

}
