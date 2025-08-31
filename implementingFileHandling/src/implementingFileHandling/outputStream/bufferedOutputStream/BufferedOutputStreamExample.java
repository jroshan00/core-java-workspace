package implementingFileHandling.outputStream.bufferedOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

import implementingFileHandling.outputStream.basicOperation.project.DataEntryApp;
import implementingFileHandling.outputStream.basicOperation.project.Student;

public class BufferedOutputStreamExample {
	public static void main(String[] args) {
		File file = new File("temp.txt");
		try (FileOutputStream fileOutputStream = new FileOutputStream(file, true);
			BufferedOutputStream bufferedOutputStream=new  BufferedOutputStream(fileOutputStream);
			) 
		{
			Student student = DataEntryApp.takeInput();
			bufferedOutputStream.write((student.toString() + "\n").getBytes());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
