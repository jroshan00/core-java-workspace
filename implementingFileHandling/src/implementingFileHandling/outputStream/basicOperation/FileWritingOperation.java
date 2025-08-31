package implementingFileHandling.outputStream.basicOperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FileWritingOperation {
	public static void main(String[] args) {
		/*
		 * This file is going to be created at the parent folder or simply we can say tha the base package.
		 * as the path is not provided.
		 * 
		 * Path types : 
		 * 	1-relative path
		 * 	2-absolute path
		 * 
		 */
		File file=new File("temp.txt");//relative path
		try(OutputStreamWriter outputStreamWriter=new FileWriter(file);
			Scanner sc=new Scanner(System.in);
			)
		{
			char c;
			do {
			System.out.println("Enter the character to enter into the the file ");
			char input=sc.next().charAt(0);
			outputStreamWriter.write(input+"\n");
			System.out.println("Enter Y/y to continue...");
			c=sc.next().charAt(0);
			}while(c=='Y' || c=='y');
		}catch(IOException e) {
			
		}
	}

}
