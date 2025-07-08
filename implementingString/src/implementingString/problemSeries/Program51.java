package implementingString.problemSeries;

public class Program51 {
	/*
	 * WAJP to take a String input and count all numeric characters in the String.
	 */
	
	 public static int getNumericCharacterCount(String str){
		 char[] stringArray=str.toCharArray();
		 int count=0;
		 for (int i = 0; i < stringArray.length; i++) {
			if(stringArray[i]>='0' && stringArray[i]<='9') {
				count++;
			}
		}
		 return count; 
	}
	
	public static void main(String[] args) {
		String s1="Mo65 64han 24Singh";
		String s2=" M o h4 a4 n  S i n g h ";
		String s3="Mo55han87Singh";
		System.out.println("Total Numeric characters in "+s1+" excluding space is "+getNumericCharacterCount(s1));
		System.out.println("Total Numeric characters in "+s2+" excluding space is "+getNumericCharacterCount(s2));
		System.out.println("Total Numeric characters in "+s3+" excluding space is "+getNumericCharacterCount(s3));
	}

}
