package implementingMethodChaining.example;

public class Employ {
	private double salary;
	private String name;
	private String id;
	
	public Employ(String id, String name, double salary) {
		super();
		this.salary = salary;
		this.name = name;
		this.id = id;
	}
	
	public Employ getSalary() {
		System.out.println("Salary is : "+this.salary);
		return this;
	}
	public Employ getName() {
		System.out.println("Name is : "+this.name);
		return this;
	}
	public Employ getId() {
		System.out.println("Id is : "+this.id);
		return this;
	}
	
}
