package implementingSet.examplesOnHashSet.withCustomObject;

import java.util.HashSet;
import java.util.Set;

public class Main$3 {
	
	public static void main(String[] args) {
		Set<Mobile> mobiles=new HashSet<Mobile>();
		mobiles.add(new Mobile("LAVA",14675.99));
		mobiles.add(new Mobile("SAMSUNG",46565.99));
		mobiles.add(new Mobile("APPLE",14565.99));
		mobiles.add(new Mobile("apple",14565.99));
		mobiles.add(new Mobile("apple",16565.99));
		mobiles.add(new Mobile("Lava",14675.99));
		mobiles.add(new Mobile("OnePlus",15665.99));
		mobiles.add(new Mobile("Realme",18995.99));
		System.out.println("All mobiles based available in set  : \n");
		for(Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		System.out.println("\n==================================\n");
		System.out.println("Sorted mobiles based on price  : \n");
		mobiles.stream().sorted().forEach(mobile->System.out.println(mobile));
		
	}

}
