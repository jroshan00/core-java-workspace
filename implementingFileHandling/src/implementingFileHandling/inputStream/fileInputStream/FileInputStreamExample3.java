package implementingFileHandling.inputStream.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample3 {
	
	public static void main(String[] args) {
		String filepath="D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\biopic.txt";
		File file=new File(filepath);
		try(FileInputStream fileInputStream =new FileInputStream(file)){
			byte[] bytes=fileInputStream.readNBytes(21);
			for(byte b:bytes) {
				System.out.printf("%-4c",(char)b);
			}
			System.out.println();
			/*
			 * Value stored in bytes array
			 * 
			 */
			System.out.printf("66 105 111 112 105 99  58   32  82 111 115 104 97 110   32  80 97 110 100 101 121");
		}catch(IOException e) {
			
		}
	}

}
