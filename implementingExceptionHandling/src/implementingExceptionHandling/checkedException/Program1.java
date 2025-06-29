package implementingExceptionHandling.checkedException;

import java.io.File;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) {
		//File Handling Concept
		File f1=new File("D:\\javaexample.txt");
		
		try {
			//createNewFile() returns boolean value
			boolean b=f1.createNewFile();
			System.out.println(b?"File is created":"File is not created");
		}catch(IOException e){
			System.out.println("File is not created");
		}
		
	}

}
