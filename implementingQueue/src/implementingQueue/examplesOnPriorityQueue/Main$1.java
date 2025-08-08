package implementingQueue.examplesOnPriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main$1 {
	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<>();
		/*
		queue.add(12);
		queue.add(54);
		queue.add(684);
		queue.add(null);
		*/
		queue.offer(54);
		queue.offer(684);
		queue.offer(12);
		queue.offer(68);
		queue.offer(61);
		//queue.offer(null);
		System.out.println("ELEMENTS OF QUEUE ARE : ");
		for (Iterator<Integer> iterator = queue.iterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		System.out.println("SORTED ELEMENTS ARE : ");
		for (Iterator<Integer> iterator = queue.iterator(); iterator.hasNext(); ) {
			System.out.print(iterator.next()+" ");
			iterator.remove();
		}
		
		/*
		while(!queue.isEmpty()) {
			System.out.print(queue.remove()+" ");
		}
        */
	}

}
