package implementingExceptionHandling.customException;

public class Registration{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Registration(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void checkEligility(int age)throws UnderAgeException{
		if(age>18){
			System.out.println("You are eligibilty for registraion");
		}
		else {
			throw new UnderAgeException();
		}
	}
	@Override
	public String toString() {
		return "Name : "+name+"\tAge : "+age;
	}

}
