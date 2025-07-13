package implementingArray.charArray;

public class CharArrayDemo {
	
	public static void main(String[] args) {
		char[] a = new char[10];

		// Explicitly setting all elements to '\0'
		for (int i = 0; i < 10; i++) {
			a[i] = 0; // same as a[i] = '\0';
		}

		// Displaying ASCII values
		for (int i = 0; i < 10; i++) {
			System.out.println("a[" + i + "] = '" + a[i] + "' ASCII: " + (int) a[i]);
		}
	}

}
