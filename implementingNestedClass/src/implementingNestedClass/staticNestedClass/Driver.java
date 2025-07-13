package implementingNestedClass.staticNestedClass;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Car has tyres : "+Car.tyres);
		Car.test();
		Car car=new Car();
		System.out.println("Part name of car :"+car.partName);
		
		
		/*
		 * As Engine is static inner class so, object can be created in one way only
		 * 
		 * Car.Engine engine=car.new Engine();	*NOT POSSIBLE IN STATIC INNER CLASS CASE*
		 * 
		 * Car.Engine engine=car.new Car.Engine();	*NOT POSSIBLE IN STATIC INNER CLASS CASE*
		 * 
		 */
		
		Car.Engine.start();
		Car.Engine engine=new Car.Engine();
		System.out.println("Engine has hp : "+Car.Engine.hp);
		System.out.println("Part name of car :"+engine.partName);
	}
}
