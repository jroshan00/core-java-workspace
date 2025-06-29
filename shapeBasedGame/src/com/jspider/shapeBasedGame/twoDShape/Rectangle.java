package com.jspider.shapeBasedGame.twoDShape;

public class Rectangle implements TwoDShape {
	double len, breath,area,perimeter;
	
	public Rectangle() {}
	
	public Rectangle(double len,double breath){
		this.len=len;
		this.breath=breath;
	}

	@Override
	public void getArea() {
		this.area=len*breath;
		//System.out.println("Area of Rectangle is : " +this.area);	
	}
	
	@Override
	public void getPeremeter() {
		this.perimeter=2*(len+breath);
		//System.out.println("Perimeter of Rectangle is : " +this.perimeter );
		
	}
	@Override
	public void getDetails() {
		System.out.println("The area of Rectangle is : " + this.area
				+"\nThe Perimeter of Rectangle is : "+this.perimeter);
	}

}
