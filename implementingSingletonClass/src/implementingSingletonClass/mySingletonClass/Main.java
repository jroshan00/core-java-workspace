package implementingSingletonClass.mySingletonClass;

public class Main {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		Singleton obj5 = Singleton.getInstance();
		

		System.out.println("Address of obj1 : " + obj1);
		System.out.println("Address of obj2 : " + obj2);
		System.out.println("Address of obj3 : " + obj3);
		System.out.println("Address of obj4 : " + obj4);
		System.out.println("Address of obj5 : " + obj5);
		System.out.println("Now checking for obj1==obj2 ? ->" + (obj1 == obj2));
	}

}
