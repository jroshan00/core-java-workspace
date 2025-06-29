package implementingString.splitMethod;

public class Program8 {
	
	public static String[] splitString(String string) {
		return string.split("a{2}");
	}
	
	public static void print(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println("'"+str[i]+"'");
		}
	}
	 public static void main(String[] args) {
		String[] str=splitString("apaaapaaaaapaapaaaaaaapaaaaaaaaaaaaaa");
		print(str);
	}

}
