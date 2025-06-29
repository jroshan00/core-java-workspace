package com.jspider.shapeBasedGame.twoDShape;

public class Triangle implements TwoDShape {
	double side1,side2,side3,area,perimeter;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
	}

	@Override
	public void getArea() {
		double s=((this.side1+this.side2+this.side3)/(2));
		this.area=Math.round(getpow((s*(s-side1)*(s-side2)*(s-side3)),0.5));
		//System.out.println("Area of Triangle is : " +this.area);	
	}
	
	@Override
	public void getPeremeter() {
		this.perimeter=this.side1+this.side2+this.side3;
		//System.out.println("Perimeter of Triangle is : " +this.perimeter );
		
	}
	@Override
	public void getDetails() {
		System.out.println("The area of Triangle is : " + this.area
				+"\nThe Perimeter of Triangle is : "+this.perimeter);
	}
	
	private double getpow(double value,double toThePower) {
		double pow=1;
		for(int i=1;i<=toThePower;i++)
			pow=pow*value;
		return pow;
	}
}
