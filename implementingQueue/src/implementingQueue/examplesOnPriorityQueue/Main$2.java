package implementingQueue.examplesOnPriorityQueue;

//import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main$2 {
	public static void main(String[] args) {
		//Queue<Laptop> laptops=new PriorityQueue<>(Comparator.naturalOrder()); 
		Queue<Laptop> laptops=new PriorityQueue<>(); //Natural Order by default
		laptops.offer(new Laptop("Frontech",659859.0));
		laptops.offer(new Laptop("HP",685468.0));
		laptops.offer(new Laptop("Lava",140990.0));
		laptops.offer(new Laptop("Samsung",154565.0));
		laptops.offer(new Laptop("Asus",149898.0));
		laptops.offer(new Laptop("Lenovo",140000.0));
		/**
		 * laptops.offer(null); throws new NullPointerException()
		 * 
		 * Reason : As <code> PriorityQueue </code> doesn't allow null values as 
		 * it internally builds Min Heap using <code> Comparator </code> 
		 * in order to compare the Object instances 
		 */
		System.out.println("Total Laptops in Queue (MIN HEAP) : \n");
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}
		
		System.out.println("\n=========================");
		
		System.out.println("\nLaptop sorted on price (in natural order by default): \n");
		while(!laptops.isEmpty()) {
			System.out.println(laptops.remove());
		}
	}
}
