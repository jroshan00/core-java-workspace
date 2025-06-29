package com.jspider.shapeBasedGame.threeDShape;

public class Cylinder implements ThreeDShape {
	double radius,height,lsa,tsa,volume;
	
	Cylinder(){}
	public Cylinder(double radius,double height){
		if(radius>0 || height>0) {
			this.radius=radius;	
			this.height=height;
		}
		else
			System.out.println("Invalid radius or height entered");
	}

	@Override
	public void getDetails() {
		System.out.println("Total Surface Area oylinder is: "+tsa
				+ "\nLateral Surface Area of Cylinder is: "+lsa 
				+"\nVolume of the Cylinder is: "+volume);
	}

	@Override
	public void getLSA() {
		this.lsa=2*3.14*radius*height; //2*pi*r*h
		//System.out.println("Lateral Surface Area of Cylinder is : " +this.lsa);
	}

	@Override
	public void getTSA() {
		this.tsa=2*3.14*radius*(radius+height);
		//System.out.println("The Total Surface Area of Cylinder is :" + tsa);
	}

	@Override
	public void getVol() {
		this.volume=3.14*radius*radius*height;
		//System.out.println("The Volume  of the Cylinder is :" + this.volume);
		
	}
	
}
