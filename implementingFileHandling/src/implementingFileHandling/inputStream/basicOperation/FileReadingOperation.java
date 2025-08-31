package implementingFileHandling.inputStream.basicOperation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingOperation {
	public static void main(String[] args) {
		String filepath="D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\student-register.txt";
		File file=new File(filepath);
		try(FileReader fr=new FileReader(file);){
			int x=fr.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fr.read();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
