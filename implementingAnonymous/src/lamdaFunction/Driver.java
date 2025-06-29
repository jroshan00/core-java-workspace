package lamdaFunction;

public class Driver {

	public static void main(String[] args) {
		
		//Implementation of lamda function
		
		Lamda l1= new Lamda(){
			public void start() {
				System.out.println("Start");
			}
		};
		
		l1.start();

	}

}
