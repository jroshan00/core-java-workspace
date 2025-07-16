package implementingSingletonClass.threadSafeSingleton;

public class Singleton {
	private static volatile Singleton instance;

	private Singleton() {
		System.out.println("Singleton instance created by : "+Thread.currentThread());
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton(); // thread-safe creation
				}
			}
		}
		return instance;
	}

}
