package usingCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Program4 {
	public static void main(String[] args) {
		Collection c=new ArrayList<>();
		c.add(10);c.add(11);c.add(15);c.add(100);
		/*
		 * clear() is void type method which is used to clear the object values
		 * of the collection.
		 * 
		 */
		c.clear(); 
		System.out.println(c);
		System.out.println(c.size());
	}
}
