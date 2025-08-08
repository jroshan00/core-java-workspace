package implementingSet.set;

public class Main3 {
	public static void main(String[] args) {
		MySet<String> cars=new MyHashSet<>();
		cars.add("TATA TIAGO");
		cars.add("Mahindra THAR");
		cars.add("Mahindra SUV300");
		
		for(String str:cars) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("Before cars.clear() --> cars.isEmpty() : "+cars.isEmpty());
		System.out.println(cars);
		System.out.println("============================");
		cars.clear();
		System.out.println("After cars.clear() --> cars.isEmpty() : "+cars.isEmpty());
		System.out.println(cars);
	
	}

}
