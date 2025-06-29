package com.qspider.weaponGame.main;

import java.util.Scanner;
import com.qspider.weaponGame.weapons.*;


public class User {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char s;
		Game g= new Game();
		do {
			g.selectWeapon();
			
		/*  *In case of downcsting*
		 * 
			Weapon w=g.selectWeapon();
			if(w instanceof Gun){
				Gun g1=(Gun)w;
			}else if(w instanceof Knief){
				Knief k1=(Knief)w;
			}else if(w instanceof Bomb){
				Bomb b1=(Bomb)w;
			}
			System.out.println(w);
		*/
		System.out.println("Enter Y/y to continue :");
		s=sc.next().charAt(0);
		
		}while(s=='y');
		
		/*
		 * Knief has no relation relation with Bomb/Gun
		 * it will work only when score is less then 400
		 * else error of type casting
		 * 
		 * Knief k=(Knief)w;
		 * k.use();
		 */
		sc.close();
		
		
	}

}
