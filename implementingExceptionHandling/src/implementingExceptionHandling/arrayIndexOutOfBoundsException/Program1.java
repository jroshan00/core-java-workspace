package implementingExceptionHandling.arrayIndexOutOfBoundsException;

public class Program1 {
	
	public static void main(String[] args) {
		String s="Roshan";
		char[] c=s.toCharArray();
		try {
			for (int i = 0; i <= c.length; i++) {
				char d = c[i];
				 System.out.print(d + " ");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
	}

}
