package implementingSet.set;

import java.util.Iterator;

public class Main1 {
	
	public static void main(String[] args) {
		MySet<Integer> students=new MyHashSet<>();
		students.add(null);
		students.add(16);
		students.add(33);
		students.add(33);
		students.add(33);
		students.add(3);
		students.add(50);
		
		Iterator<Integer> itr=students.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
