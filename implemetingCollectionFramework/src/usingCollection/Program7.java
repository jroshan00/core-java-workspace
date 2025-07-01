package usingCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Program7 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		Collection d=new ArrayList();
		c.add(1);c.add(2);c.add(3);c.add(4);
		d.add(1);d.add(2);d.add(3);d.add(4);
		
		Collection cc=new ArrayList();
		Collection dd=new ArrayList();
		cc.add(1);cc.add(2);cc.add(3);cc.add(4);
		dd.add(4);dd.add(3);dd.add(2);dd.add(1);
		/*
		 * contansAll(Collection c) : takes input of Collection instance and returns
		 * true if collection object values are present in <this> Collection instance
		 * otherswise returns false
		 */
		if(c.containsAll(d)) {
			System.out.println("all objects of c is available in d");
		}else {
			System.out.println("all objects of c is not available in d");
		}
		System.out.println("==========================================");
		if(cc.containsAll(dd)) {
			System.out.println("all objects of cc is available in dd");
		}else {
			System.out.println("all objects of cc is not available in dd");
		}
	}

}
