package implementingFileHandling.inputStream.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample2 {

	public static void main(String[] args) {
		String filepath = "D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\biopic.txt";
		File file = new File(filepath);
		try (FileInputStream fileInputStream = new FileInputStream(file)) {
			byte[] arr = fileInputStream.readAllBytes();
			for (byte bytes:arr) {
					System.out.print((char)bytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
