package implementingFileHandling.inputStream.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample4 {
	public static void main(String[] args) {
		String filepath="D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\biopic.txt";
		File file=new File(filepath);
		try(FileInputStream fileInputStream=new FileInputStream(file)){
			fileInputStream.skipNBytes(1828);
			int i=fileInputStream.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=fileInputStream.read();
			}
		}catch(IOException e) {
			
		}
	}

}
