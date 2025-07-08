package implemetingCollectionFramework.assessmentPrograms;

import java.util.Collection;
import java.util.Vector;

public class Program11 {
	
	/*
	 * WAJP to create a collection of integers and count and print 
	 * all the prime numbers available in collection.
	 * 
	 */
	public static void main(String[] args) {
		Collection<Integer> c=new Vector<>();
		c.add(26);
		c.add(3);
		c.add(65);
		c.add(12);
		c.add(141);
		c.add(5);
		c.add(54);
		c.add(4);
		c.add(55);
		c.add(99);
		c.add(24);
		c.add(17);
		c.add(84);
		c.add(94);
		c.add(101);
		c.add(191);
		c.add(9);
		c.add(11);
		
		//way 1 :
		int count=0;
		for (int i = 0; i < c.size(); i++) {
			if(isPrime((Integer)c.toArray()[i])) {
				count++;
				System.out.println(c.toArray()[i]);
			}
		}
		System.out.println("Total prime elements are : "+count);
	}
	
	public static boolean isPrime(Integer x) {
		if(x<2 || x%2==0) {
			return false;
		}
		if(x==2 || x==3) {
			return true;
		}
		for(int i=3;i*i<=x;i+=2) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
}
