package methodOverloadingPolymorphism;

public class Rectangle extends TwoDShape {
	@Override
	void area(){
		System.out.println("The area is l*w");
		System.out.println(this);
	}

}
