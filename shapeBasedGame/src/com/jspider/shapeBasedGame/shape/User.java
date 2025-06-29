package com.jspider.shapeBasedGame.shape;

import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char s;
		Game g=new Game();
		do {
			g.selectShape();
			System.out.print("Enter Y/y to continue :- ");
			s=sc.next().charAt(0);
		}while(s=='y'||s=='Y');
		System.out.println("-----Thank You-----");
		sc.close();
	}
}
