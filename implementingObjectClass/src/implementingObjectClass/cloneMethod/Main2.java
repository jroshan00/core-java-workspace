package implementingObjectClass.cloneMethod;

public class Main2 {
	
	public static void main(String[] args) {
		
		/*
		 * Can we create a new Insance withow new keyword ?
		 */
		Car car1=new Car();
		Car car2=(Car)car1.clone();
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car1.equals(car2));
	}

}
