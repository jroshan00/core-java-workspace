package implementingString.problemSeries;

import java.util.Scanner;

public class CheckSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the String value :");
		String s1=sc.nextLine();
		System.out.println("Enter  the subString to check :");
		String s2=sc.nextLine();
		System.out.println(isSubString(s1,s2)?
				s2 +" is Substring of "+s1:
				s2 + " is Not SubString of "+s1);
		sc.close();
	}
	
	/*
	
	 public static boolean isSubString(String string,String subString){
		return string.contains(subString);
	}

	 */
	
	public static boolean isSubString(String string,String subString){
		int n=string.length();
		int m=subString.length();
		for(int i=0;i<=n-m;i++){
			int j;
			for(j=0;j<m;j++){
				if(string.charAt(i+j)!=subString.charAt(j))
					break;
			}
			if(j==m) {
				return true;
			}
		}
		return false;
	}

}
