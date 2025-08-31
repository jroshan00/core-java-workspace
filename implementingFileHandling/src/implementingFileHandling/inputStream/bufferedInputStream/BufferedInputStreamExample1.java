package implementingFileHandling.inputStream.bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample1 {
	public static void main(String[] args) {
		File file = new File("D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\sample-png-file.png");
		try (FileInputStream fileInputStream = new FileInputStream(file);
				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);) {

			byte[] bytes = bufferedInputStream.readAllBytes();
			for (byte b : bytes) {
				System.out.println(b);
			}
			System.out.println("Total bytes stored : " + bytes.length);
		} catch (IOException e) {

		}
	}

}
