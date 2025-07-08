package implemetingCollectionFramework.assessmentPrograms;

import java.util.Collection;
import java.util.Vector;

public class Program12 {
	/*
	 * WAJP to create a collection of integers and count and 
	 * print all the palindrome numbers available in collection.
	 */
	public static void main(String[] args) {
		Collection<Integer> c=new Vector<>();
		c.add(1226);
		c.add(303);
		c.add(605);
		c.add(121);
		c.add(141);
		c.add(51515);
		c.add(5445);
		c.add(4);
		c.add(50005);
		c.add(99);
		c.add(2654);
		c.add(10027);
		c.add(84);
		c.add(94);
		c.add(101);
		c.add(191);
		c.add(902209);
		c.add(136541);
		
		//way 1 :
		int count=0;
		for (int i = 0; i < c.size(); i++) {
			if(isPalindrome((Integer)c.toArray()[i])) {
				count++;
				System.out.println(c.toArray()[i]);
			}
		}
		System.out.println("Total prime elements are : "+count);
	}
	
	public static boolean isPalindrome(Integer num) {
		int rev=0;
		int orginalNum=num;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev==orginalNum;
	}
}
