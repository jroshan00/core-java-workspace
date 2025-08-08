package implementingSet.set;

public class Main2 {
	public static void main(String[] args) {
		MySet<String> cars=new MyHashSet<>();
		cars.add("TATA TIAGO");
		cars.add("Mahindra THAR");
		cars.add("Mahindra SUV300");
		
		System.out.println("cars.contains(\"TATA TIAGO\") : "+cars.contains("TATA TIAGO"));
		System.out.println("cars.contains(\"Tata Tiago\") : "+cars.contains("Tata Tiago"));
		System.out.println("cars.contains(\"Mahindra THAR\") : "+cars.contains("Mahindra THAR"));
	}

}
