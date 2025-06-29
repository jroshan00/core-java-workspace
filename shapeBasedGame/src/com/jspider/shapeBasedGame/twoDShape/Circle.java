package com.jspider.shapeBasedGame.twoDShape;

public class Circle implements TwoDShape {
	double radius,area,perimeter;
	public Circle() {}
	public Circle(double radius) {
		if(radius>0)
			this.radius=radius;
		else
			System.out.println("Invalid radius Entered");
	}


	@Override
	public void getArea() {
		this.area=3.14*radius*radius;
		//System.out.println("Area of circle is : " +this.area);	
	}
	
	@Override
	public void getPeremeter() {
		this.perimeter=3.14*2*radius;
		//System.out.println("Perimeter of circle is : " +this.perimeter );
		
	}
	@Override
	public void getDetails() {
		System.out.println("The area of circle is : " + this.area
				+"\nThe Perimeter of circle is : "+this.perimeter);
	}

}
