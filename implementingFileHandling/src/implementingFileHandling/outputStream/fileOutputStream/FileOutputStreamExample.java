package implementingFileHandling.outputStream.fileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import implementingFileHandling.outputStream.basicOperation.project.DataEntryApp;
import implementingFileHandling.outputStream.basicOperation.project.Student;

public class FileOutputStreamExample {
	
	public static void main(String[] args) {
		File file=new File("temp.txt");
		Student student=DataEntryApp.takeInput();
		try(FileOutputStream fos=new FileOutputStream(file)){
			fos.write((student.toString()+"\n").getBytes());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
