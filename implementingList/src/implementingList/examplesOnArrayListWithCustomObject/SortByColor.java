package implementingList.examplesOnArrayListWithCustomObject;

import java.util.Comparator;

public class SortByColor implements Comparator<Car>{

	@Override
	public int compare(Car car1, Car car2) {
		return car1.getColor().toLowerCase().compareTo(car2.getColor().toLowerCase());
	}
	

}
