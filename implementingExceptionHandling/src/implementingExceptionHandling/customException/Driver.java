package implementingExceptionHandling.customException;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter valid age : ");
		int age=sc.nextInt();
		Registration r1=new Registration(name,age);
		try {
			r1.checkEligility(r1.getAge());
			System.out.println(r1.toString());
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
		finally{
			sc.close();
		}
		System.out.println("---------Program Ends---------");
	}

}
