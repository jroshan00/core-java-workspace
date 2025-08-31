package implementingFileHandling.inputStream.bufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample2 {

	public static void main(String[] args) {
		String filepath = "D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\biopic.txt";
		File file = new File(filepath);
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferredReader = new BufferedReader(fileReader);) {
			String s = bufferredReader.readLine();
			while (s != null) {
				System.out.println(s);
				s = bufferredReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
