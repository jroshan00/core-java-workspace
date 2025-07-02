package usingCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Program11 {
	public static void main(String[] args) {
		Map m= new HashMap();
		m.put(1, "Rohan");
		m.put(2, "Sohan");
		m.put(3, "Mohan");
		
		Collection c=new ArrayList();
		c.add(51);
		c.add(81);
		c.add(71);
		c.stream().filter(n->(Integer)n%2==0).forEach(n->System.out.println(n));
		System.out.println(c.stream().anyMatch(n->(Integer)n%2==0));
	}

}
