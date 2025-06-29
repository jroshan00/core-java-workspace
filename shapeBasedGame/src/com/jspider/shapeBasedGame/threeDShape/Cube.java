package com.jspider.shapeBasedGame.threeDShape;

public class Cube implements ThreeDShape {
	double side,tsa,lsa,volume;
	
	public Cube() {}
	public Cube(double side){
		if(side>0)
			this.side=side;
		else
			System.out.println("Invalid side entered");
	}

	@Override
	public void getDetails() {
		System.out.println("Total Surface Area of Cube is: "+tsa
				+ "\nLateral Surface Area of Cube is: "+lsa 
				+"\nVolume of the Cube is: "+volume);
		
	}

	@Override
	public void getLSA() {
		this.lsa=4*side*side; //4*a*a
		//System.out.println("Lateral Surface Area of Cube is : " +this.lsa);
				
	}

	@Override
	public void getTSA() {
		this.tsa=(6*side*side);
		//System.out.println("Total Surface Area of Cube is : " +this.tsa);
		
	}

	@Override
	public void getVol() {
		this.volume=(side*side*side);
		//System.out.println("The Volume of the Cube : " +this.volume);
	}

}
