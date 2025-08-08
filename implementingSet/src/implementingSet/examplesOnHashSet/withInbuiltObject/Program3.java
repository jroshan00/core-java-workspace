package implementingSet.examplesOnHashSet.withInbuiltObject;

import java.util.Set;
import java.util.TreeSet;

public class Program3 {
	public static void main(String[] args) {
		Set<Integer> num1 = new TreeSet<>();
		num1.add(1);
		//num1.add(2);
		num1.add(3);
		//num1.add(4);
		num1.add(5);
		
		System.out.println("num1 - > "+num1);
		
		Set<Integer> num2 = new TreeSet<>();
		//num2.add(1);
		num2.add(2);
		//num2.add(3);
		num2.add(4);
		//num2.add(5);
		
		System.out.println("num2 - > "+num2);
		System.out.println("\n=============================");
		System.out.println("before num1.addAll(num2) : " + num1);
		num1.addAll(num2);
		System.out.println("after num1.addAll(num2) : " + num1);
	}
}
