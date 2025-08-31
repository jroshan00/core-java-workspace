package implementingFileHandling.inputStream.fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) {
		String filepath="D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\biopic.txt";
		File file=new File(filepath);
		try(FileReader filereader=new FileReader(file);){
			int i=filereader.read();
			while(i!=-1) {
				System.out.print((char)i);
				 i=filereader.read();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
