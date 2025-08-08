package implementingList.linkedList;

public class Main3 {
	//AbstractCollection
	public static void main(String[] args) {
		MySinglyLinkedList<Integer> list=new MySinglyLinkedList<>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		System.out.println("before : "+list);
		System.out.println("size : "+list.size());
		System.out.println();
		list.removeLast();
		System.out.println("after : "+list);
		System.out.println("size : "+list.size());
	}

}
