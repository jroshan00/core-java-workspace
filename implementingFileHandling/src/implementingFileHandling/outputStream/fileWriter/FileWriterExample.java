package implementingFileHandling.outputStream.fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import implementingFileHandling.outputStream.basicOperation.project.DataEntryApp;
import implementingFileHandling.outputStream.basicOperation.project.Student;

public class FileWriterExample {
	public static void main(String[] args) {
		File file = new File("temp.txt");
		try (FileWriter fileWriter = new FileWriter(file, true)) {
			Student student = DataEntryApp.takeInput();
			fileWriter.write(student.toString() + "\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
