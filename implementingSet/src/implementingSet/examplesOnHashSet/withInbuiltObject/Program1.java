package implementingSet.examplesOnHashSet.withInbuiltObject;

import java.util.HashSet;
import java.util.Set;

public class Program1 {
	public static void main(String[] args) {
		Set<String> cars = new HashSet<>();
		cars.add("TATA TIAGO");
		cars.add("Mahindra SUV");
		cars.add("TATA nano");

		System.out.println("cars.contains(\"TATA nano\") : " + cars.contains("TATA nano"));
		System.out.println("cars.contains(\"Tata nano\") : " + cars.contains("Tata nano"));
	}

}
