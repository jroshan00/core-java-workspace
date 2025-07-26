package implementingAnnotations.customAnnotationWithEnum;

public class Main {
	
	@IntrinsicValue(TrafficSignal.GREEN)
	public static void showSignal() {
		System.out.println("Signal shown ");
		
	}
	
	public static void main(String[] args) {
		showSignal();
	}
}
