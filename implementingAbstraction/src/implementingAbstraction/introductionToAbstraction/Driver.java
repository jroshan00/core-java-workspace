package implementingAbstraction.introductionToAbstraction;

public class Driver {

	public static void main(String[] args) {
		/*
		Vehicle v1=new Vehicle();
		v1.getDetails();
		
		Vehicle v2=new Vehicle();
		v2.getDetails();
		*/
		System.out.println("------------Vehicle v3=new ElectricalCar();------------");
		Vehicle v3=new ElectricalCar();
		v3.getDetails();
		
		System.out.println("-------------Vehicle v4=new ElectricalCar(\"Four\",\"XUV\",\"On road\",\"red\",\"charging\")--------------");
		
		Vehicle v4=new ElectricalCar("Four","XUV","On road","red","charging");
		v4.start();
		v4.stop();
		v4.getDetails();
		System.out.println("Vehicle.brand : "+Vehicle.brand);
		System.out.println("v4.color : "+v4.color);
		System.out.println("v4.mobilityType : "+v4.mobilityType);
		System.out.println("v4.getcolor() : "+v4.getcolor());
		System.out.println("v4.getMobilityType() : "+v4.getMobilityType());
		
		System.out.println("--------------Car c1=(Car)v4-------------");
		
		Car c1=(Car)v4;
		c1.start();
		c1.stop();
		c1.drive();
		c1.openGate();
		c1.closeGate();
		c1.getDetails();
		System.out.println("Car.brand : "+Car.brand);
		System.out.println("c1.color : "+c1.color);
		System.out.println("c1.mobilityType : "+c1.mobilityType);
		System.out.println("c1.tyres : "+c1.tyres);
		System.out.println("c1.model : "+c1.model);
		
		
		System.out.println("-----------ElectricalCar ec1=(ElectricalCar)v4----------------");
		
		ElectricalCar ec1=(ElectricalCar)v4;
		ec1.drive();
		ec1.start();
		ec1.stop();
		ec1.openGate();
		ec1.closeGate();
		ec1.charging();
		ec1.getDetails();
		System.out.println(ElectricalCar.brand);
		System.out.println("ec1.color : "+ec1.color);
		System.out.println("ec1.mobilityType : "+ec1.mobilityType);
		System.out.println("ec1.tyres : "+ec1.tyres);
		System.out.println("ec1.model : "+ec1.model);
		System.out.println("ec1.mode) : "+ec1.mode);
		System.out.println("ec1.getcolor() : "+ec1.getcolor());
		System.out.println("ec1.getMobilityType() : "+ec1.getMobilityType());
		
		
	}

}
