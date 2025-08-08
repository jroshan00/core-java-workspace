package implementingDeque.sampleProject;

//import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Task t1=new Task("A",321,14584654.695);
		Task t2=new Task("B",645,23584654.987);
		Task t3=new Task("C",235,216484654.78);
		Task t4=new Task("D",98,165484654.87);
		Task t5=new Task("E",87,65484654.4);
		Task t6=new Task("F",97,545456454.45);
		Task t7=new Task("G",976,789484654.4);
		
		//Queue<Task> tasks=new PriorityQueue<Task>(Comparator.reverseOrder());
		Queue<Task> tasks=new PriorityQueue<Task>();
		tasks.offer(t1);
		tasks.offer(t2);
		tasks.offer(t3);
		tasks.offer(t4);
		tasks.offer(t5);
		tasks.offer(t6);
		tasks.offer(t6);
		tasks.offer(t7);
		while(!tasks.isEmpty()) {
			System.out.println(tasks.remove());
		}
	}

}
