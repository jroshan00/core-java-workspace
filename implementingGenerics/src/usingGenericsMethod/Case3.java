package usingGenericsMethod;

import java.util.ArrayList;
import java.util.Collection;
import usingGenericsClass.Accept;

public class Case3 {
	
	//Anytype of Collection is is accepted here
			public static	<T extends Accept>  void print(Collection<T> t) {
				System.out.println(t);
			}

			public static void main(String[] args) {
				Collection<Integer> c1= new ArrayList<>();
				Collection<Double> c2= new ArrayList<>();
				Collection<String> c3= new ArrayList<>();
				
				c1.add(1); c1.add(2); c1.add(3); c1.add(4);
				c2.add(1.2); c2.add(2.0); c2.add(3.8); c2.add(4.4);
				c3.add("Rohan"); c3.add("Mohan"); c3.add("Hero"); c3.add("King");
				
				Case1.print(c1);
				Case1.print(c2);
				Case1.print(c3);
			}



}
