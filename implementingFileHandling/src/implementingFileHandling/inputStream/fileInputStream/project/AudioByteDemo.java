package implementingFileHandling.inputStream.fileInputStream.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AudioByteDemo {
	public static void main(String[] args) {
		String inputpath="D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\test_song.wav"; //the path should be correct
		String outputpath="D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\test_song_reconstructed.wav";
		File inputFile=new File(inputpath);
		File outputFile=new File(outputpath);
		
		try(FileInputStream fileInputStream=new FileInputStream(inputFile);
				FileOutputStream fileOutputStream=new FileOutputStream(outputFile);
			){
			// Step 1: Read WAV file into byte array
			byte[] audiobytes=fileInputStream.readAllBytes();
			// Step 2: Write the byte array back to a new WAV file
			fileOutputStream.write(audiobytes);
			System.out.println("Reconstructed audio file saved as: " + outputpath);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
