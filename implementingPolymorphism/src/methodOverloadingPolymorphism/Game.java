package methodOverloadingPolymorphism;

import java.util.Scanner;

public class Game{
	
	public TwoDShape selectShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for ----> Circle");
		System.out.println("Enter 2 for ----> Rectangle");
		System.out.println("Enter 3 for ----> Triangle");
		int choice=sc.nextInt();	
		
		switch(choice) {
		
			case 1:
				System.out.println("You have selected Circle");
				//System.out.println(this);
				Circle c1=new Circle();
				return c1;
			case 2:
				System.out.println("You have selected Rectangle");
				//System.out.println(this);
				return new Rectangle();
			case 3:
				System.out.println("You have selected Triangle");
				//System.out.println(this);
				return new Triangle();
				
			default:
				System.out.println("Invalid input");
				selectShape();
				
			
		}
		return null;
		
	}
	
}

