package constructorOverloadingPolymorphism;

public class Driver {

	public static void main(String[] args) {
		Car c1=new Car(); //connection is built on runtime
		Car c2=new Car("Hello"); //connection is built on runtime
	}

}
