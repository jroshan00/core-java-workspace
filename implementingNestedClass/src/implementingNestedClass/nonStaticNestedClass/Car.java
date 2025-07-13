package implementingNestedClass.nonStaticNestedClass;

public class Car {

	static int tyres = 4;
	final String partName = "Body";

	public static void test() {
		System.out.println("Car is being tested.....");
	}
	public void imported() {
		System.out.println("Car is being imported...");
	}

	class Engine {
		static int hp = 40;
		final String partName = "Engine";

		public static void start() {
			System.out.println("Engine is being started...");
		}
		
		public void stop() {
			System.out.println("Engine is being stopped...");
		}
	}

}
