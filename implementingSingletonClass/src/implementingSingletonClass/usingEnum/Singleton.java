package implementingSingletonClass.usingEnum;

public enum Singleton {
	INSTANCE;

	public void showMessage() {
		System.out.println("Hello from Singleton Enum!");
	}

}
