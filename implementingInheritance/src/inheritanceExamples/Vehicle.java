package inheritanceExamples;

public class Vehicle {
	String name;
	String color;
	Vehicle(){
		
	}
	Vehicle(String name){
		this.name=name;
	}
	Vehicle(String name,String color){
		this(name);
		this.color=color;
	}
	String getDetails() {
		return this.name + " has color : "+ this.color;
	}
}
