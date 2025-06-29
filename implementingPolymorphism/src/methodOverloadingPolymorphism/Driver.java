package methodOverloadingPolymorphism;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TwoDShape t1= new Circle();
			TwoDShape t2= new Rectangle();
			TwoDShape t3= new Triangle();
			t1.area();
			t2.area();
			t3.area();

	}

}
