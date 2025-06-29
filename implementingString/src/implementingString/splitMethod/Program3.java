package implementingString.splitMethod;

public class Program3 {
	public static void main(String[] args) {
		String input = "one,two;three four";
		/*
		 * split on comma, semicolon, or space
		 */
		String[] parts = input.split("[,; ]"); 
		for(String string:parts){
			System.out.println(string);
		}
	}
}
