package implementingAbstraction.introductionToAbstraction;

public abstract class Car extends Vehicle {
	String tyres;
	String model;
	
	public Car() {
		super();
	}

	public Car(String typres,String model) {
		this.model=model;
		this.tyres=typres;
	}
	public Car(String typres,String model,String mobilityType,String color) {
		super(color,mobilityType);
		this.model=model;
		this.tyres=typres;
	}
	public abstract void openGate();
	public abstract void closeGate();
	
	public  void drive(){
		System.out.println("Vehicle is in motion");
	}
	
	@Override
	public void getDetails() {
		System.out.println("\nCar Details:\nCar is of : " + brand+" having mobility as "+mobilityType+"\nCar has color : " + color + " and is of model "+model+"\nCar has : "+tyres+" tyres\n");
	}
	
	
}
