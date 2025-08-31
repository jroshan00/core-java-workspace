package implementingFileHandling.outputStream.bufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import implementingFileHandling.outputStream.basicOperation.project.DataEntryApp;
import implementingFileHandling.outputStream.basicOperation.project.Student;

public class BufferedWriterExample {
	public static void main(String[] args) {
		File file = new File("temp.txt");
		try (FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter=new  BufferedWriter(fileWriter);
			) 
		{
			Student student = DataEntryApp.takeInput();
			bufferedWriter.write(student.toString() + "\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
