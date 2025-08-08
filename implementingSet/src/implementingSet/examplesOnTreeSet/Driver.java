package implementingSet.examplesOnTreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		Car c1=new Car(6978464.5,"TATA","RED");
		Car c6=new Car(6978464.5,"TATA","RED");
		Car c8=new Car(6978464.5,"SONALIKA","YELLOW");
		Car c2=new Car(656564.5,"HONDA","BLACK");
		Car c3=new Car(655464.5,"BMW","WHITE");
		Car c4=new Car(9765464.5,"MAHINDRA","YELLOW");
		Car c5=new Car(9785464.5,"MARUTI","GREEN");
		Car c7=new Car(9785464.5,"MARUTI","GREEN");
		
		Set<Car> cars=new TreeSet<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		cars.add(c7);
		
		for (Iterator iterator = cars.iterator(); iterator.hasNext();) {
			Car car = (Car) iterator.next();
			System.out.println(car);
			
		}
	}

}
