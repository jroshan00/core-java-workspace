package implementingMethods.programs;

import java.time.Duration;

public class GenerateRandomNumbers {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;;i++) {
			System.out.println(generateRandomNumber(10, 50));
			Duration duration= Duration.ofSeconds(1);
			Thread.sleep(duration);
		}
	}
	
	public static int generateRandomNumber(int min,int max) {
		return (int)(Math.random()*(max-min));
	}

}
