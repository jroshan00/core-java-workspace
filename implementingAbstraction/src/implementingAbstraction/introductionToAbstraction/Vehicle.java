package implementingAbstraction.introductionToAbstraction;

public abstract class Vehicle {
	static String brand="TATA";
	String mobilityType;
	String color;

	public Vehicle() {
		super();
	}
	public Vehicle(final String color,String mobilityType) {
		super();
		this.color=color;
		this.mobilityType=mobilityType;
			//static variable called by Class reference
	}
	
	public abstract void start();
	public abstract void stop();
	
	
 public abstract void getDetails();
	
	public String getcolor(){
		return color;
	}

	public String getMobilityType(){
		return mobilityType;
	}
	

}
