package implementingString.comparingString;

import java.util.Scanner;

public class Program1 {
	/*
	 * You are given a String array of length N, short the String array in increasing order
	 * 
	 */
	
	public static void sortStringArray(String[] str) {
		int len=str.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				int x=str[i].toLowerCase().compareTo(str[j].toLowerCase());
				if(x>0) {
				}
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		sc.next();
		String[] str=new String[len];
		for(int i=0;i<len;i++) {
			str[i]=sc.nextLine();
		}
		
	}

}
