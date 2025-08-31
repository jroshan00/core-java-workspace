package implementingFileHandling.outputStream.basicOperation.project;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DataEntryApp {
	final static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int counter=1;
		File file=new File("D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\student-register.txt");
		char key;
		do {
			try(OutputStreamWriter osw=new FileWriter(file,true);){
				Student student=takeInput();
				osw.write(counter++ +" :- "+student.toString()+"\n=====================================================\n");
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Enter Y/y to continue....");
			key=sc.nextLine().charAt(0);
		}while(key=='Y'|| key=='y');
		System.out.println("Oops!! you terminated the program....");
		
	}
	
	public static Student takeInput(){
		Student student=new Student();
		System.out.print("Enter the fname : ");
		student.setFname(sc.nextLine());
		System.out.println();
		System.out.print("Enter the lname : ");
		student.setLname(sc.nextLine());
		System.out.println();
		System.out.print("Enter the age : ");
		student.setAge(sc.nextLine());
		System.out.println();
		System.out.print("Enter the address : ");
		student.setAddress(sc.nextLine());
		System.out.println();
		return student;
	}
}
