package usingCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Program2 {
	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<>();
		Collection<String> str=new ArrayList<>();
		c.add(10);c.add(11);c.add(15);c.add(100);
		str.add("Mohan");str.add("Sohan");str.add("Rohan");str.add("Manmohan");
		System.out.println(str);
		str.forEach(n->System.out.print(n.toLowerCase()+" "));
		System.out.println("\n===================================");
		str.forEach(n->System.out.print(n.getBytes()+" "));
		System.out.println("\n===================================");
		c.forEach(n->System.out.println(n+" to binary string : "+Integer.toBinaryString(n)));
	}

}
