package InterviewPrep.string;

import java.util.Arrays;

public class Anagram {
	
	
	public static void main(String[] args) {
		String s1="Listen";
		String s2="silent";
		if(isAnagram(s1, s2)) {
			System.out.println("Anagram...");
		}else {
			System.out.println("Not Anagram..");
		}
	}
	
	
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		else if(s1==null || s2==null)
			return false;
		else {
			char[] ch1=s1.replaceAll("\\s","").toLowerCase().toCharArray();
			char[] ch2=s2.replaceAll("\\s","").toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i]) {
					return false;
				}
			}
			return true;
		}
	}

}
