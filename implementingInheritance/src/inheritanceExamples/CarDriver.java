package inheritanceExamples;

public class CarDriver {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Vehicle v2 =new Vehicle("Car","Green");
		Car c1=new Car();
		Car c2 =new Car("Car","Pink",420,"Lemborgini","Hybrid");
		System.out.println(v1.getDetails());
		System.out.println(v2.getDetails());
		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
	}

}
