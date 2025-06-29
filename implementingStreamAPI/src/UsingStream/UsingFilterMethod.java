package UsingStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class UsingFilterMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Collection<Integer> c1= new ArrayList<>();
		for(int i=1;i<10;i++) {
			System.out.println("Enter number to add to the Collection :");
			int ix=sc.nextInt();
			c1.add(ix);
		}
		c1.stream().filter(n->n%2==0).distinct().forEach(c->System.out.println(c));
		sc.close();

	}

}
