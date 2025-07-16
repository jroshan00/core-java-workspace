package implementingSingletonClass.mySingletonClass;

public class Singleton {
	// 1. Static variable to hold single instance
	private static Singleton instance;

	// 2. Private constructor
	private Singleton() {
		System.out.println("Singleton instance created");
	}

	// 3. Public static method to return instance
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton(); // create if not exists
		}
		return instance;
	}
}
