package implementingString.comparingString;

public class EqualsIgnoreCaseMethod {
	public static boolean checkForEquality(String str1,String str2) {
		if(str1.equalsIgnoreCase(str2)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str1="Hello";
		String str2="hElLo";
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("'"+str1+"'"+" is equal to "+"'"+str2+"'");
		}else {
			System.out.println("'"+str1+"'"+" is not equal to "+"'"+str2+"'");
		}
	}

}
