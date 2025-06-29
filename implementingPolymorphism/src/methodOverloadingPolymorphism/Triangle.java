package methodOverloadingPolymorphism;

public class Triangle extends TwoDShape{
	@Override
	void area(){
		System.out.println("The area is 0.5*b*h");
		System.out.println(this);
	}


}
