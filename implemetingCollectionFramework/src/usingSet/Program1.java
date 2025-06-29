package usingSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program1 {
	public static void main(String[] args) {
		Set<Integer> s1= new HashSet<>();
		s1.add(null);
		s1.add(32);
		s1.add(15);
		s1.add(75);
		s1.add(61);
		System.out.println(s1);
		/*
		for(int i:s1) {
			System.out.println(i);
		}
		*/
		
		Iterator<Integer> itr=s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
