package implementingSet.examplesOnHashSet.withInbuiltObject;

import java.util.Set;
import java.util.TreeSet;
public class Program2 {
	/*
	 * By the following example we can conclude 
	 * that using retain all we are performing 
	 * Intersection operations between two sets.
	 * So only common elements will be retained in the 
	 * resultant set.
	 * 
	 */
	public static void main(String[] args) {
		Set<Integer> num1=new TreeSet<>();
		num1.add(101);
		num1.add(102);
		num1.add(103);
		//num1.add(104);
		num1.add(105);
		
		System.out.println("num1 - > "+num1);
		
		Set<Integer> num2=new TreeSet<>();
//		num2.add(101);
//		num2.add(102);
		num2.add(103);
		num2.add(104);
		num2.add(105);
		
		System.out.println("num2 - > "+num2);
		
		System.out.println("\n=============================");
		System.out.println("before num1.retainAll(num2) : "+num1);
		num1.retainAll(num2);
		System.out.println("after num1.retainAll(num2) : "+num1);
	}
}
