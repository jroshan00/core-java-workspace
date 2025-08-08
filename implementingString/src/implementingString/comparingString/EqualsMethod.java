package implementingString.comparingString;

public class EqualsMethod {
	public static boolean check(String str1,String str2) {
		if(str1.equals(str2)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String str1 ="hello";
		String str2="hello";
		System.out.println(check(str1,str2)?"String is equal":"String is not equal");
	}

}
