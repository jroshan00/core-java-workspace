package constructor;

public class ConstructorOverloading {
	String name;
	int age;
	double height;
	String address ;
	
	
	ConstructorOverloading(){
		
	}
	
	ConstructorOverloading(String name){
		this.name=name;
	}
	
	ConstructorOverloading(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	ConstructorOverloading(String name,int age,double height){
		this.name=name;
		this.age=age;
		this.height=height;
	}
	ConstructorOverloading(String name,int age,double height, String address ){
		this.name=name;
		this.age=age;
		this.height=height;
		this.address=address;
	}
	
	String getDetails() {
		return "Name is : " + name + "\tAge is : " + age + "\tHeight is : " + height + "\tAddress is : " +address;
	}


}
