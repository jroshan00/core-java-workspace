package implementingSet.examplesOnHashSet.withCustomObject;

import java.util.HashSet;
import java.util.Set;

public class Main$1 {
	public static void main(String[] args) {
		/*
		 * Using Comparator
		 */
		Set<Car> cars = new HashSet<>();
		cars.add(new Car(6978464.5, "TATA", "RED"));
		cars.add(new Car(6978464.5, "TATA", "RED"));
		cars.add(new Car(656564.5, "HONDA", "BLACK"));
		cars.add(new Car(655464.5, "BMW", "WHITE"));
		cars.add(new Car(9765464.5, "MAHINDRA", "YELLOW"));
		cars.add(new Car(9785464.5, "MARUTI", "GREEN"));
		cars.add(new Car(9785464.5, "MARUTI", "GREEN"));
		
		System.out.println("\n====== Cars in unsorted order in Set of Cars =====\n");
		for (Car c : cars) {
			System.out.println(c);
		}
				
		/**
		 * Lambda expressions in Java provide a concise way to implement functional
		 * interfaces—like Comparator—without writing full class implementations.
		 * 
		 * The Comparator interface has a single abstract method:
		 * 
		 * int compare(T o1, T o2); 
		 * 
		 * Above  method defines custom sorting logic. Using lambda, we can write it inline like:
		 * 
		 * Comparator<Car> byPrice = (c1, c2) -> c1.getPrice().compareTo(c2.getPrice());
		 * 
		 * Below Case Code : inline sorting(lambda)
		 * <code> cars.sort((c1, c2) -> ...) </code>
		 * 
		 */
		
		System.out.println("\n=======Sorting Based on price=====================\n");
		cars.stream().sorted((car1, car2) -> (int) (car1.getPrice() - car2.getPrice()))
				.forEach(c -> System.out.println(c));
		
		System.out.println("\n=======Sorting Based on color=====================\n");
		cars.stream().sorted((car1, car2) -> (int) (car1.getColor().toLowerCase().compareTo(car2.getColor().toLowerCase())))
				.forEach(c -> System.out.println(c));
		
		System.out.println("\n=======Sorting Based on brand name=================\n");
		cars.stream().sorted((car1, car2) -> (int) (car1.getName().toLowerCase().compareTo(car2.getName().toLowerCase())))
				.forEach(c -> System.out.println(c));
		
		
		
		
		
		System.out.println("\n=======Sorting Based on price using CarPriceComparater class=====================\n");
		cars.stream().sorted(new CarPriceCompararor()).forEach(c->System.out.println(c));
		
		System.out.println("\n=======Sorting Based on color=====================\n");
		cars.stream().sorted((car1, car2) -> (int) (car1.getColor().toLowerCase().compareTo(car2.getColor().toLowerCase())))
				.forEach(c -> System.out.println(c));
		
		System.out.println("\n=======Sorting Based on brand name=================\n");
		cars.stream().sorted((car1, car2) -> (int) (car1.getName().toLowerCase().compareTo(car2.getName().toLowerCase())))
				.forEach(c -> System.out.println(c));
		
	}

}
