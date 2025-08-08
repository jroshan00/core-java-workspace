package implementingDeque.examplesOnDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program1 {
	/*
	 * Features of Deque :- 
	 * 
	 * We can add any type of elements in Deque.
	 * We cannt add Null value in Deque.
	 * Indexing is not provided in Deque.
	 * We can iterate on deque by using iterator method or descending iterator method.
	 * Deque interface is implemented by 
	 * i) LinkedList 
	 * ii) ArrayDeque
	 *
	 */
	
	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		dq.offer(84);
		dq.offer(54);
		dq.offer(64);
		dq.offer(87);
		for (Integer integer : dq) {
			System.out.print(integer+" ");
		}
	}

}
