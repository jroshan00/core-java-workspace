package com.jspider.shapeBasedGame.threeDShape;

public class Cone implements ThreeDShape {
	double radius,height,slantHeight,tsa,lsa,volume;
	public Cone() {}
	public Cone(double radius,double height) {
		if(radius>0 || height>0) {
			this.radius=radius;	
			this.height=height;
		}
		else
			System.out.println("Invalid radius or height entered");
	}

	@Override
	public void getDetails() {
		System.out.println("Total Surface Area of Cone is: "+tsa
				+ "\nLateral Surface Area of Cone is: "+lsa 
				+"\nVolume of the Cone is: "+volume);
	}

	@Override
	public void getLSA() {
		this.lsa=3.14*radius*slantHeight; //pi*r*l
		//System.out.println("Lateral Surface Area of Cone is : " +this.lsa);
	}

	@Override
	public void getTSA() {
		this.slantHeight=Math.round(getpow((getpow(radius,2)+getpow(height,2)),0.5));
		this.tsa=Math.round(3.14*(radius+slantHeight));
		//System.out.println("The Total Surface Area of Cone is :" + tsa);
	}

	@Override
	public void getVol() {
		this.volume=(0.33)*(3.14*radius*radius*height);
		//System.out.println("The Volume  of the Cone is :" + this.volume);
		
	}
	
	private double getpow(double value,double toThePower) {
		double pow=1;
		for(int i=1;i<=toThePower;i++)
			pow=pow*value;
		return pow;
	}

}
