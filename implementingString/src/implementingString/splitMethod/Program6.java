package implementingString.splitMethod;

public class Program6 {
	
	public static String[] splitString(String string) {
		return string.split("(com\\.)+");
	}
	public static void main(String[] args) {
		String[] str=splitString("Hellocom.com.Roshancom.comPandey");
		for (int i = 0; i < str.length; i++) {
			System.out.println("'"+str[i]+"'");
		}
	}
}
