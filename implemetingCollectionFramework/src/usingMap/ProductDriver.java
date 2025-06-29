package usingMap;

import java.util.HashMap;
import java.util.Map;

public class ProductDriver {

	public static void main(String[] args) {
		Map<Product,Integer> hp=new HashMap<>();
		Product p1=new Product("Nike","Shoes",8989);
		Product p2=new Product("ParkAvenue","Perfume",5000);
		Product p3=new Product("Reebok","Bat",4999);
		Product p4=new Product("Reebok","Bat",4999);
		Product p5=new Product("Puma","Shoes",5999);
		Product p6=new Product("Puma","Shoes",5999);
		hp.put(p1,101);
		hp.put(p2,201);
		hp.put(p3,310);
		hp.put(p4,411);
		hp.put(p5,454);
		hp.put(p6,464);
		
		
		/*
		 * Case : 1
		 * After overriding equals() method of object class
		 */
		System.out.println("========================================");
		System.out.println("Case : 1");
		System.out.println(p5.equals(p1));
		
		
		/*
		 * Case : 2
		 * After Overriding the HashCode() as well as equals() method of object class
		 */
		System.out.println("========================================");
		System.out.println("Case : 2");
		System.out.println("Address of the instances of Product : ");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println("========================================");
		System.out.println("p6.getClass()--->"+p6.getClass());
		System.out.println("========================================");
		hp.forEach((key,value)->System.out.println(key + " has value : "+ value));
	}
}
