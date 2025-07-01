package usingCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Program1 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(10);c.add(11);c.add(15);c.add(100);
		System.out.println(c);
		c.removeIf(n->(Integer)n%2==0);
		System.out.println(c);
		
		
	}

}
