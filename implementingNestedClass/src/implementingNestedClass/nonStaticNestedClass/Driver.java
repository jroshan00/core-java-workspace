package implementingNestedClass.nonStaticNestedClass;

public class Driver {


	public static void main(String[] args) {
		System.out.println("Car has tyres : "+Car.tyres);
		Car.test();
		//Car.imported(); * NOT POSSIBLE AS imported() IS NON STATIC METHOD OF CAR*
		Car car=new Car();
		car.imported();
		System.out.println("Part name of car :"+car.partName);
		
		
		/*
		 * As Engine is static inner class so, object can be created in one way only
		 * 
		 * Car.Engine engine=car.new Car.Engine();	*NOT POSSIBLE IN NON STATIC INNER CLASS CASE ALSO*
		 * 
		 * Note : One thing to note here, weather the inner class in static or non static 
		 * we can can create a reference like Car.Engine  i,e OuterClass.InnerClass
		 */
		
		Car.Engine.start();
		Car.Engine e;
		//String partName = e.partName; * AS e IS NOT INITIALIZED *
		//Car.Engine.stop(); * SIMILARLY, NOT POSSIBLE AS stop() is NON STATIC METHOD OF ENGINE INNER CLASS*
		Car.Engine engine=car.new Engine();
		engine.stop();
		System.out.println("Engine has hp : "+Car.Engine.hp);
		System.out.println("Part name of car :"+engine.partName);
	}

}
