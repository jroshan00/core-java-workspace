package implementingList.linkedList;

import java.util.LinkedList;

public class Main {
	 public static void main(String[] args) {
		MySinglyLinkedList<Integer> mySinglyLinkedList=new MySinglyLinkedList<>();
		LinkedList<Integer> linkedList=new LinkedList<>();
		linkedList.add(12);
		linkedList.add(15);
		linkedList.add(18);
		linkedList.add(20);
		System.out.println("\n=========LinkedList===========\n");
		System.out.println("First element of linkedList : "+linkedList.getFirst());
		System.out.println("Last element of linkedList : "+linkedList.getLast());
		System.out.println("Size of linkedList : "+linkedList.size());
		System.out.println("Removing First element of linkedList : "+linkedList.removeFirst());
		System.out.println("After Removing First element. Now first element of linkedList : "+linkedList.getFirst());
		System.out.println("After Removing First element. Now last element of linkedList : "+linkedList.getLast());
		System.out.println("After removing first element. Size  of linkedList : "+linkedList.size());
		linkedList.addFirst(12);
		System.out.println("---Element Added at First ---");
		System.out.println("After adding element at first. Size  of linkedList : "+linkedList.size());
		System.out.println("Also, the first element added in linkedList : "+linkedList.getFirst());
		System.out.println("\n====================\n");
		System.out.println("Removing Last element of linkedList : "+linkedList.removeLast());
		System.out.println("After Removing last element. Now first element of linkedList : "+linkedList.getFirst());
		System.out.println("After Removing last element. Now last element of linkedList : "+linkedList.getLast());
		System.out.println("After removing last element. Size of linkedList : "+linkedList.size());
		linkedList.addLast(20);
		System.out.println("---Element Added at Last ---");
		System.out.println("After adding element at last. Size  of linkedList : "+linkedList.size());
		System.out.println("Also, the last element added in linkedList : "+linkedList.getLast());
		System.out.println("\n=========My SinglyLinkedList===========\n");
		mySinglyLinkedList.add(12);
		mySinglyLinkedList.add(15);
		mySinglyLinkedList.add(18);
		mySinglyLinkedList.add(20);
		System.out.println("First element of mySinglyLinkedList : "+mySinglyLinkedList.getFirst());
		System.out.println("Last element of mySinglyLinkedList : "+mySinglyLinkedList.getLast());
		System.out.println("Size of mySinglyLinkedList : "+mySinglyLinkedList.size());
		System.out.println("Removing First element of mySinglyLinkedList : "+mySinglyLinkedList.removeFirst());
		System.out.println("After Removing First element. Now first element of mySinglyLinkedList : "+mySinglyLinkedList.getFirst());
		System.out.println("After Removing First element. Now last element of mySinglyLinkedList : "+mySinglyLinkedList.getLast());
		System.out.println("After removing first element. Size of mySinglyLinkedList : "+mySinglyLinkedList.size());
		mySinglyLinkedList.addFirst(12);
		System.out.println("---Element Added at First ---");
		System.out.println("After adding element at first. Size  of mySinglyLinkedList : "+mySinglyLinkedList.size());
		System.out.println("Also, the first element added in mySinglyLinkedList : "+mySinglyLinkedList.getFirst());
		System.out.println("\n====================\n");
		System.out.println("Removing Last element of linkedList : "+mySinglyLinkedList.removeLast());
		System.out.println("After Removing last element. Now first element of mySinglyLinkedList : "+mySinglyLinkedList.getFirst());
		System.out.println("After Removing last element. Now last element of mySinglyLinkedList : "+mySinglyLinkedList.getLast());
		System.out.println("After removing last element. Size of mySinglyLinkedList : "+mySinglyLinkedList.size());
		mySinglyLinkedList.addLast(20);
		System.out.println("---Element Added at Last ---");
		System.out.println("After adding element at last. Size  of mySinglyLinkedList : "+mySinglyLinkedList.size());
		System.out.println("Also, the last element added in mySinglyLinkedList : "+mySinglyLinkedList.getLast());
		
	}

}
