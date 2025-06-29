package methodOverloadingPolymorphism;

public class Circle extends TwoDShape{
	@Override
	void area(){
		System.out.println("The area is r*r");
		System.out.println(this);
	}

}
