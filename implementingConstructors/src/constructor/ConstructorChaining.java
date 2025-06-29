package constructor;

public class ConstructorChaining {
	
	String name;
	int age;
	double height;
	String address;
	
	/*
	 * Three types of Constructors
	 * 1)Default Constructor/No argument Constructor
	 * 2)Parameterized Constructor
	 * 3)Copy Constructor
	 */
	
	
	ConstructorChaining(){
		
	}
	
	ConstructorChaining(String name){
		this.name=name;
	}
	
	ConstructorChaining(String name,int age){
		this(name);
		this.age=age;
	}
	
	ConstructorChaining(String name,int age,double height){
		this(name,age);
		this.height=height;
	}
	ConstructorChaining(String name,int age,double height, String address ){
		this(name,age,height);
		this.address=address;
	}
	
	String getDetails() {
		return "Name is : " + name + "\tAge is : " + age + "\tHeight is : " + height + "\tAddress is : " +address;
	}
}
