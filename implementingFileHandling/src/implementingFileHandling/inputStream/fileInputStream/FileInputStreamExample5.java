package implementingFileHandling.inputStream.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample5 {
	public static void main(String[] args) {
		String filepath = "D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\biopic.txt";
		File file = new File(filepath);
		try (FileInputStream fileInputStream = new FileInputStream(file)) {
			fileInputStream.skipNBytes(1828);
			byte[] bytes= fileInputStream.readAllBytes();
			for (byte b:bytes) {
				System.out.print((char) b);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
