package implementingString.splitMethod;

public class Program7 {
	
	public static void main(String[] args) {
		String string="jroshanpandey@gmail.com";
		String[] str=string.split("[@\\.]");
		for (int i = 0; i < str.length; i++) {
			System.out.println("'"+str[i]+"'");
		}
	}
	
}
