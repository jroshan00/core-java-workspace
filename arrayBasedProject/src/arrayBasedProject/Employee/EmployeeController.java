package arrayBasedProject.Employee;

import java.util.Scanner;

public class EmployeeController {

	String name;
	String empId;
	int age;
	double salary;

	EmployeeController() {
		super();
		// default constructor
	}

	EmployeeController(String name, String empId, double salary, int age) {
		this.name = name;
		this.age = age;
		this.empId = empId;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeController employ = new EmployeeController();
		EmployeeController[] empArray = new EmployeeController[6];
		empArray[0] = new EmployeeController("Rohan", "s10928", 20000, 26);
		empArray[1] = new EmployeeController("Sohan", "s10908", 22200, 35);
		empArray[2] = new EmployeeController("Mohan", "s10108", 25090, 26);
		empArray[3] = new EmployeeController("Krish", "s10708", 25070, 27);
		empArray[4] = new EmployeeController("Ritik", "s11708", 29070, 30);
		empArray[5] = new EmployeeController("Krish", "s12708", 23070, 29);
		System.out.println(
				"Enter 1 ->Access all the employees\n" + 
				"Enter 2 ->Print and count all employee with age <30 years\n"+
				"Enter 3 ->Print the details of employee with highest and least salary\n"+
				"Enter 4 ->Search whether an employ is available or not by id\n"+
				"Enter 5 ->Search whether an employ is available or not by name\n"+
				"Enter 6 ->Count and print all the employee whose salary is more than average salary\n");
		
		System.out.println("Select choice : ");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			employ.accessAllEmoloyee(empArray); //when non static
			// Employ.accessEvenIndexElement(empArray); //when static
			// accessEvenIndexElement(empArray);	when static
			break;
		case 2:
			employ.accessAllEmoloyeeAsPerAge(empArray);
			break;
		case 3:
			employ.accessEmployeeWithHighestSalary(empArray);
			break;
		case 4:
			System.out.println("Enter the empId to search : ");
			sc.nextLine();
			String id = sc.nextLine();
			employ.getEmpById(empArray, id);
			break;
		case 5:
			System.out.println("Enter the Name to search : ");
			sc.nextLine();
			String name = sc.nextLine();
			employ.getEmpByName(empArray, name);
			break;
		case 6:
			employ.getAvgSal(empArray);

		}
	}

	public void accessAllEmoloyee(EmployeeController[] empArray) {
		for (EmployeeController e : empArray)
			System.out.println(e.getDetails());
	}

	public void accessAllEmoloyeeAsPerAge(EmployeeController[] empArray) {
		int count = 0;
		for (EmployeeController e : empArray) {
			if (e.age < 30) {
				count++;
				System.out.println(e.getDetails());
			}
		}
		System.out.println("Total Employ having age less than 30 is : " + count);

	}

	public void accessEmployeeWithHighestSalary(EmployeeController[] empArray) {
		EmployeeController empWithMinSal = empArray[0];
		EmployeeController empWithMaxSal = empArray[0];
		for (EmployeeController emp : empArray) {
			if (emp.salary > empWithMaxSal.salary)
				empWithMaxSal = emp;
			if (emp.salary < empWithMinSal.salary)
				empWithMinSal = emp;
		}
		System.out.println("Employee with Max Salary is having details : " + empWithMaxSal.getDetails());
		System.out.println("Employee with Min Salary is having details : " + empWithMinSal.getDetails());

	}

	public void getEmpById(EmployeeController[] empArray, String id) {
		for (EmployeeController emp : empArray) {
			if (id.equalsIgnoreCase(emp.empId)) {
				System.out.println(emp.getDetails());
				return;
			}
		}
		System.out.println("Id is not available");
	}

	public void getEmpByName(EmployeeController[] empArray, String name) {
		for (EmployeeController emp : empArray) {
			if (name.equalsIgnoreCase(emp.name)) {
				System.out.println(emp.getDetails());
				return;
			}
		}
		System.out.println("Name is not available");
	}

	public void getAvgSal(EmployeeController[] empArray) {
		double sum = 0;
		int count = 0;
		for (EmployeeController emp : empArray) {
			sum = sum + emp.salary;
		}
		double avgSal = sum / (empArray.length);
		for (EmployeeController emp : empArray) {
			if (emp.salary > avgSal) {
				count++;
				System.out.println(emp.getDetails());
			}
		}
		if (count == 0)
			System.out.println("No Employ is having salary more the Average");
		else
			System.out.println(
					"Total Employees having salary more the Average Salary : " + Math.round(avgSal) + " is : " + count);
	}

	public String getDetails() {
		return "Employ Name is : " + this.name + " having age : " + this.age + " Employ ID : " + this.empId
				+ " Salary : " + this.salary;
	}

}
