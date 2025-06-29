package implementingString.splitMethod;

public class Program12 {
	public static String[] splitString(String string) {
		return string.split("ac");
	}
	public static void print(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println("'"+str[i]+"'");
		}
	}
	public static void main(String[] args) {
		String[] str=splitString("acRoshanPandeyacIsGoingaHomeac");
		print(str);
	}
}
