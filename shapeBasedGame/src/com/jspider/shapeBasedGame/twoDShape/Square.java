package com.jspider.shapeBasedGame.twoDShape;

public class Square implements TwoDShape {
	
	double side,area,perimeter;
	public Square() {}
	public Square(double side) {
		this.side=side;
	}
	@Override
	public void getArea() {
		this.area=side*side;
		//System.out.println("Area of Square is : " +this.area);	
	}
	
	@Override
	public void getPeremeter() {
		this.perimeter=4*side;
		//System.out.println("Perimeter of Square is : " +this.perimeter );
		
	}
	@Override
	public void getDetails() {
		System.out.println("The area of Square is : " + this.area
				+"\nThe Perimeter of Square is : "+this.perimeter);
	}

}
