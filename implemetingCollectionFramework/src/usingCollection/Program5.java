package usingCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Collection c=new ArrayList<>();
		c.add(10);c.add(11);c.add(15);c.add(100);
		 System.out.println("Enter the value to check :");
		 Object o=(Object)scanner.nextLine();
		 /*
		  * coantaims
		  */
		if(c.contains(o)) {
			System.out.println(10+" : is present");
		}
		else {
			 System.out.println(10 +" :is not present");
		}
	}

}
