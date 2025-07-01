package usingCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Program8 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		Collection d=new ArrayList();
		Collection e=new ArrayList();
		c.add(1);c.add(2);c.add(3);c.add(4);
		d.add(1);d.add(2);d.add(3);d.add(4);
		e.add(2);e.add(1);e.add(3);e.add(4);
		
		/*
		 * equals() is internally overriden here 
		 * if collection has same object values as well as in same order then
		 * only equals() method returns true otherwise false
		 */
		
		System.out.println(c.equals(c)?" Both equal as per equals() method ":" Not equal as per equals() method");
		System.out.println(c.equals(d)?" Both equal as per equals() method ":" Not equal as per equals() method");
		System.out.println(c.equals(e)?" Both equal as per equals() method ":" Not equal as per equals() method");
		
	}

}
