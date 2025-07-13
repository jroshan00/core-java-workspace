package implementingList.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main$1 {
	public static void main(String[] args) {
		MySinglyLinkedList<Integer> mySinglyLinkedList = new MySinglyLinkedList<>();
		mySinglyLinkedList.add(12);
		mySinglyLinkedList.add(15);
		mySinglyLinkedList.add(18);
		mySinglyLinkedList.add(20);
		LinkedList<Integer> linkedList=new LinkedList<>();
		linkedList.add(12);
		linkedList.add(15);
		linkedList.add(18);
		linkedList.add(20);
		
		//mySinglyLinkedList.add(2,13);
		linkedList.add(2,13);
		
		Iterator<Integer> itr=linkedList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\nafter adding data at 0 index mySinglyLinkedList : "+linkedList.get(2));
		itr=mySinglyLinkedList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\nafter adding data at 0 index linkedList : "+mySinglyLinkedList.get(2));
	}

}
