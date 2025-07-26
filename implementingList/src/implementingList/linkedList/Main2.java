package implementingList.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main2 {
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
		
		int indexForMySinglyLinkedList=3;
		int indexForLinkedList=3;
		
		
		System.out.println("Size before "+linkedList.size());
		linkedList.add(indexForLinkedList,13);
		System.out.println("after adding data at index "+ indexForLinkedList+" in linkedList & element is : "+linkedList.get(indexForLinkedList));
		System.out.println("Size after "+linkedList.size());
		Iterator<Integer> itr=linkedList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n\nSize before "+mySinglyLinkedList.size());
		mySinglyLinkedList.add(indexForMySinglyLinkedList,13);
		System.out.println("after adding data at index "+ indexForMySinglyLinkedList+" in mySinglyLinkedList & element is : "+mySinglyLinkedList.get(indexForMySinglyLinkedList));
		System.out.println("Size after "+mySinglyLinkedList.size());
		itr=mySinglyLinkedList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
