package implementingSingletonClass.usingEnum;

public class Main {
	public static void main(String[] args) {
		Singleton enumInstance1 = Singleton.INSTANCE;
		Singleton enumInstance2 = Singleton.INSTANCE;
		Singleton enumInstance3 = Singleton.INSTANCE;
		
		System.out.println(enumInstance1);
		System.out.println(enumInstance2);
		System.out.println(enumInstance3);
	}

}
