package frameworkVsArray;

import java.util.ArrayList;
import java.util.Collection;

public class ImplementingCollection {
	
	@SuppressWarnings("rawtypes")
	static Collection c1= new ArrayList();
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		c1.add(1);
		c1.add("@");
		c1.add(125);
		c1.add(12.8);
		System.out.println("Array List is " + c1);
	}
	
	
	

}
