package usingList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program2 {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(122);
		l.add(192);
		l.add(120);
		l.add(172);
		
		ListIterator<Integer>  itr1=l.listIterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		System.out.println("=====================");
		
		ListIterator<Integer>  itr2=l.listIterator(l.size());
		while(itr2.hasPrevious()){
			System.out.println(itr2.previous());
		}
	}

}
