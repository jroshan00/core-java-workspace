package inheritanceExamples;

public class Car extends Vehicle {
	int hp;
	String brand;
	String fuelType;
	
	Car(){
		
	}
	Car(String name,String color,int hp,String brand,String fuelType){
		super(name,color);
		this.hp=hp;
		this.brand=brand;
		this.fuelType=fuelType;
		
	}
}
