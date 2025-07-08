package usingCollection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Vector;

public class Program20 {
	/*
	 * a) Why concurrent modification occurs in collection framework?
	 * 
	 * When collcetion is modified while the underline collection  is being 
	 * iterated than modification will not be allowed it will cause concurrent exception
	 * 
	 * b) Why Iterator is provided when we have for each loop for collection framework?
	 * 
	 *  Iterator provides more control flexibility and safe removal on colletion which is 
	 *  not possible which is not possible wring for Each lop so we are given iterator.
	 *  
	 *  Note  : 
	 *  1) Collection doesn't have indexing so we can't add remove, 
	 *  add using indexing if we have collection references.
	 *  2) List provides the indexing feature 
	 *  so it makes possible to run loop on list using indexing.
	 *  
	 */
	public static void main(String[] args) {
		Collection<Integer> collection = new Vector<>();
		collection.add(101);
		collection.add(4);
		collection.add(5135);
		collection.add(1115);
		collection.add(325);
		collection.add(415);
		collection.add(65465);
		collection.add(45);
		collection.add(6);
		collection.add(65);

		Iterator<Integer> itr = collection.iterator();
		while (itr.hasNext()) {
			int e=itr.next();
			if (e % 2 == 0) {
				itr.remove();
			}
		}
		System.out.println("Collection after opeartion 1 : " + collection);
		for (Integer x : collection) {
			if (x % 2 !=0) {
				try {
					collection.remove(x);
				} catch (ConcurrentModificationException e) {
					System.err.println("ConcurrentModificationException happenned");
				}
			}
		}
		System.out.println("Collection after opeartion 2 : " + collection);
	}

}
