package implementingString.problemSeries;

public class Program63 {
	
	/*
	 * WAJP to take a String input and print the sum of 
	 * all the numeric characters in the String.
	 */
	
	public static int sumOfNumericCharacters(String string) {
		int sum=0;
		for(char c:string.toCharArray()){
			if(c>=48 && c<=57) {
				sum=sum+(c-48);
			}
		}
		return sum;
		
	}
	
	 public static void main(String[] args) {
		String s="123lmf";
		System.out.println(sumOfNumericCharacters(s));
	}

}
