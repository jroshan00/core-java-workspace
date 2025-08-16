package implementingMethodChaining.example;

public class Driver {
	public static void main(String[] args) {
		Employ emp=new Employ("1001","Roshan Pandey",320000.0);
		System.out.println(emp.getId().getName().getSalary().getClass());
	}
}
