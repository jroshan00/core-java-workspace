package implementingAnonymous.anonymousClass;

public class Vehicle {

	public void start() {
		System.out.println("starting...");
	}

	public static void main(String[] args) {
		System.out.println("=======Creating anonymous innner class ===========");
		Vehicle v1 = new Vehicle() {
			public void start() {
				System.out.println("Started already....");
			}
		};
		v1.start();
	}

}
