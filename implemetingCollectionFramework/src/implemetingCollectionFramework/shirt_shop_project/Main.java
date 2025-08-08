package implemetingCollectionFramework.shirt_shop_project;


import java.util.List;
import java.util.Map;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Vector;
//import java.util.Stack;
//
//import java.util.Set;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.TreeSet;
//
//import java.util.Queue;
//import java.util.PriorityQueue;
//import java.util.Deque;
//import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) {
		Service service=new Service();
		service.addShirt(new Shirt("Levis",SizeType.S,"Red",9899.99));
		service.addShirt(new Shirt("COBB",SizeType.S,"White",2699.99));
		service.addShirt(new Shirt("Sparky",SizeType.S,"Yellow",2969.99));
		service.addShirt(new Shirt("Red Tape",SizeType.S,"Red",6599.99));
		
		//service.printAllShirts();
		
		List<Shirt> shirts=service.getAllShirts();
		
		//shirts.stream().forEach(shirt->System.out.println(shirt));
//		System.out.println("====================");
//		shirts.stream().sorted((s1,s2)->(int)(s1.price-s2.price)).forEach(shirt->System.out.println(shirt));
		
		service.sortOnShirtPriceLowToHigh();
		System.out.println("=================================================================");
		service.sortOnShirtPriceHighToLow();
		System.out.println("=================================================================");
		List<String> brands=service.getlistAllTheBrands();
		brands.forEach(n->System.out.println(n));
		System.out.println("=================================================================");
		List<String> colors=service.getlistAllTheColors();
		colors.forEach(n->System.out.println(n));
		System.out.println("=================================================================");
		List<String> sizes=service.getlistAllTheSizes();
		sizes.forEach(n->System.out.println(n));
		System.out.println("=================================================================");
		Map<String,Integer> shirtOfBrands=service.getNoOfShirtsOnEachBrand();
		shirtOfBrands.forEach((brand,count)->System.out.println("brand : "+brand +"--> count  :"+count));
	}

}
