package implementingFileHandling.inputStream.fileInputStream.project;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AudioByteWithMetadata {
	public static void main(String[] args) {

		String inputPath = "D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\test_song.wav";																							// correct
		String outputPath = "D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\test_song_reconstructed.wav";
		File inputFile = new File(inputPath);
		File outputFile = new File(outputPath);

		try (	// for fetching byte data from WAV file
				FileInputStream fileInputStream = new FileInputStream(inputFile);
				// for Appending metadata to end of WAV file
				FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
				// for Building LIST/INFO chunk
				ByteArrayOutputStream meta = new ByteArrayOutputStream();
				DataOutputStream dataOutputStream = new DataOutputStream(meta);
		) {
			// Step 1: Read WAV file into byte array
			byte[] audioBytes = fileInputStream.readAllBytes();
			System.out.println("Audio read successfully. Total bytes: " + audioBytes.length);

			// Step 2: Create metadata chunk ("LIST" with INFO -> ICMT comment)
			String comment = "Created by Roshan";
			byte[] textBytes = comment.getBytes("ASCII");

			// RIFF chunk alignment requires sizes to be even
			int size = textBytes.length;
			if (size % 2 != 0) {
				size++;
			}

			// LIST chunk header
			dataOutputStream.writeBytes("LIST");
			dataOutputStream.writeInt(Integer.reverseBytes(4 + 4 + size)); // total chunk size
			dataOutputStream.writeBytes("INFO");

			// ICMT subchunk
			dataOutputStream.writeBytes("ICMT");
			dataOutputStream.writeInt(Integer.reverseBytes(size)); // size of comment
			dataOutputStream.write(textBytes);
			if (textBytes.length % 2 != 0) {
				dataOutputStream.writeByte(0); // pad for even size
			}
			byte[] metaChunk = meta.toByteArray();

			// Step 3: Append metadata to end of WAV file
			fileOutputStream.write(audioBytes); // original audio
			fileOutputStream.write(metaChunk); // metadata chunk

			System.out.println("WAV file saved with metadata tag: " + outputPath);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
