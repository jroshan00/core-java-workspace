package constructor;

public class CopyConstructor {
	

	String name;
	int age;
	double height;
	String address;
	
	//no argument constructor
	CopyConstructor(){
		
	}
	
	//parameterized constructor
	CopyConstructor(ConstructorChaining c){
		this.name=c.name;
		this.age=c.age;
		this.height=c.height;
		this.address=c.address;
		
	}
	
	String getDetails() {
		return "Name is : " + name + "\tAge is : " + age + "\tHeight is : " + height + "\tAddress is : " +address;
	}
}
