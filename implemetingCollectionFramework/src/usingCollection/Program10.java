package usingCollection;

import java.util.Collection;
import java.util.ArrayList;


public class Program10 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.forEach(n->factorial((Integer)n));
	}
	
	public static void factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
