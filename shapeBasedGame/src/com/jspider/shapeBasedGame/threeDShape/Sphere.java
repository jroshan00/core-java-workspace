package com.jspider.shapeBasedGame.threeDShape;

public class Sphere implements ThreeDShape {
	
	double r,tsa,lsa,volume;
	
	public Sphere() {}
	public Sphere(double r){
		if(r>0)
			this.r=r;
		else
			System.out.println("Invalid radius entered");
	}

	@Override
	public void getDetails() {
		System.out.println("Total Surface Area of Sphere is: "+tsa
				+ "\nLateral Surface Area of Sphere is: "+lsa 
				+"\nVolume of the Sphere is: "+volume);
		
	}

	@Override
	public void getLSA() {
		this.lsa=4*3.14*r*r; //4*pi*r*r
		//System.out.println("Lateral Surface Area of Sphere is : " +this.lsa);
				
	}

	@Override
	public void getTSA() {
		this.tsa=(6*r*r);
		//System.out.println("Total Surface Area of Sphere is : " +this.tsa);
		
	}

	@Override
	public void getVol() {
		this.volume=(r*r*r);
		//System.out.println("The Volume of the Sphere : " +this.volume);
	}


}
