package implementingList.examplesOnArrayListWithCustomObject;

import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		/*
		 * Using Comparator in List<Car>
		 * 
		 */
		List<Car> cars = List.of(new Car(600000.0, "TATA", "RED"),
								 new Car(100000.0, "HYUNDAI", "GREEN"),
								 new Car(400000.0, "HONDA", "BLACK"),
								 new Car(800000.0, "BMW", "WHITE"),
								 new Car(400000.0, "HYUNDAI", "GREEN"));

		System.out.println("Sort by Price:");
		cars.stream().sorted(Comparator.comparing(Car::getPrice)).forEach(System.out::println);
		
		//Using Inline sorting (lambda)
		System.out.println("\nSort by Name:");
		cars.stream().sorted(Comparator.comparing((car) -> car.getName(), String.CASE_INSENSITIVE_ORDER))
				.forEach(System.out::println);
		
		//Using Chain comparisons
		System.out.println("\nSort by Price then Name:");
		cars.stream()
				.sorted(Comparator.comparing(Car::getPrice).thenComparing(Car::getName, String.CASE_INSENSITIVE_ORDER))
				.forEach(System.out::println);
		//Using External comparator class	
		System.out.println("\nSort by Color: ");
		cars.stream().sorted(new SortByColor()).forEach(car->System.out.println(car));
	}

}
