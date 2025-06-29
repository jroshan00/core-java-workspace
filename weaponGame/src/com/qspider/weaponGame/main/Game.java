package com.qspider.weaponGame.main;

import com.qspider.weaponGame.weapons.*;
import java.util.Scanner;

public class Game {
	public Game() {
		System.out.println("=========The Game has started========");
		
	}
	
	public Weapon selectWeapon(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score : ");
		int score=sc.nextInt();
		if(score<=400) {
			System.out.println("----You got Knief----");
			Knief k=new Knief();
			k.use();
			
			return k;
		}else if(score<=800){
			System.out.println("----You got Knief----");
			Gun g=new Gun();
			g.use();
			return g;
		}
		System.out.println("----You got Bomb----");
		Bomb b=new Bomb();
		b.use();
		//sc.close();
		return b;
		
		
	}

}
