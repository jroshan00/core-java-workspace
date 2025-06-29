package implementingAbstraction.introductionToAbstraction;

public class ElectricalCar extends Car {
	String mode;

	public ElectricalCar() {
		super();
	}
	public ElectricalCar(String typres,String model,String mobilityType,String color,String mode) {
		super(typres,model,mobilityType,color);
		this.mode=mode;
	}
	
	public void charging() {
		System.out.println("Car is charging");
	}

	@Override
	public void openGate() {
		System.out.println("get is opened");
		
	}

	@Override
	public void closeGate() {
		System.out.println("gate is closed");
		
	}

	@Override
	public void start() {
		System.out.println("Car has started");
		
	}

	@Override
	public void stop() {
		System.out.println("Car has stopped");
		
	}
/*
 * 	NOT COMPULSORY TO OVERRIDE AS IT IS ALREADY OVERRIDEN IN CAR
 *  IF OVERRIDEN HERE THEN DUE TO METHOD HIDING getDetails():ElectricalCar 
 *  WILL BE LOADED AND EXECUTED AT RUNTIME(RUNTIME POLYMORPHISM)
	@Override
	public void getDetails() {
		System.out.println("\nElectricCar Details : \nCar is of : " + brand+" having mobility as "+mobilityType+"\nCar has color : " + color + " and is of model "+model+"\nCar has "+tyres+" tyres"+"\nCar is in "+mode+" mode\n");
	}
	
*/

}
