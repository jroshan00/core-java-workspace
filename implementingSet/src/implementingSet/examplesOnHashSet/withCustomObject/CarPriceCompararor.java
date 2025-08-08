package implementingSet.examplesOnHashSet.withCustomObject;

import java.util.Comparator;

public class CarPriceCompararor implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return (int)(o1.getPrice()-o2.getPrice());
	}

}
