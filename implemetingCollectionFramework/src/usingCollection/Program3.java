package usingCollection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings(value="rawtypes")
public class Program3 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Collection c=new ArrayList();
		Collection d=new ArrayList<>();
		c.add(1);c.add(2);c.add(3);c.add(4);
		System.out.println(c);
		d.add(5);d.add(6);d.add(7);d.add(8);
		System.out.println(d);
		/*
		 * addAll: returns boolean value
		 */
		System.out.println(c.addAll(d)); 
		c.forEach(n->System.out.println(n));
	}
}
