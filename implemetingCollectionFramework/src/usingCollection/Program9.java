package usingCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Program9 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		Collection d=new ArrayList();
		Collection e=new ArrayList();
		c.add(1);c.add(2);c.add(3);c.add(4);
		d.add(1);d.add(2);d.add(3);d.add(4);
		e.add(2);e.add(1);e.add(3);e.add(4);
		/*
		 * getClass() method of Object having return type Class
		 * It gives fully qualified name of class followed by class keyword 
		 * 
		 */
		System.out.println(c.getClass());
		
		/*
		 * Similarly, we can also store 
		 */
		Integer n = 10;
	    Class<? extends Integer> cls=n.getClass();
	    System.out.println(cls.toGenericString());
	    System.out.println(cls);
	    System.out.println(cls.toString());
	    System.out.println(cls.getClass());
	}

}
