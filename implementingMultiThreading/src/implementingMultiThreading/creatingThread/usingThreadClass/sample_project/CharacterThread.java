package implementingMultiThreading.creatingThread.usingThreadClass.sample_project;

public class CharacterThread extends Thread {
	char character;

	public CharacterThread() {
	}

	public CharacterThread(char character) {
		this.character = character;
	}

	@Override
	public void run() {
		for (char c = 'A'; c <= character; c++) {
			System.out.println("Letter: " + c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			}
		}
	}

}
