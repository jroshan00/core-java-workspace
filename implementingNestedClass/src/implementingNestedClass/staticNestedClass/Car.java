package implementingNestedClass.staticNestedClass;

public class Car {
	static int tyres=4;
	final String  partName="Body";
	public static void test() {
		System.out.println("Car is testing.....");
	}
	
	static class Engine{
		static int hp=40;
		final String partName="Engine";
		public static void start() {
			 System.out.println("Engine is starting...");
		}
	}

}
