package implementingString.problemSeries;

public class Program52 {
	/*
	 * WAJP to take a String input and count all the characters
	 * without spaces in the String.
	 *  
	 */
	
	//way1 :
	public static int countCharacters(String str) {
		int count=0;
		for(char c:str.toCharArray()) {
			if(c==' '){
				continue;
			}
			else {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String s1="Mo  han     Singh";
		String s2=" M o h a n  S i n g h ";
		String s3="MohanSingh";
		System.out.println("Total characters in "+s1+" excluding space is "+countCharacters(s1));
		System.out.println("Total characters in "+s2+" excluding space is "+countCharacters(s2));
		System.out.println("Total characters in "+s3+" excluding space is "+countCharacters(s3));
		
	}

}
