package implementingMultiThreading.creatingThread.usingRunnableInterface.sample_project;

public class LetterTask implements Runnable {
	char character;
	LetterTask(char character){
		this.character=character;
	}
	
	@Override
	public void run() {
		for (char c = 'A'; c <= character; c++) {
			System.out.println("Character : "+c);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
