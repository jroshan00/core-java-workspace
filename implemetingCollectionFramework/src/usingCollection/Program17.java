package usingCollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Program17 {
	public static void main(String[] args) {
		Collection collection=new Vector<>();
		collection.add(101);
		collection.add(4);
		collection.add(11);
		collection.add(21);
		collection.add(31);
		collection.add(41);
		
		Iterator itr=collection.iterator();
		while(itr.hasNext()) {
			if(!((Integer)itr.next()%2==0)) {
				itr.remove();
			}
		}
		collection.stream().forEach(n->System.out.println(n));
		
	}

}
