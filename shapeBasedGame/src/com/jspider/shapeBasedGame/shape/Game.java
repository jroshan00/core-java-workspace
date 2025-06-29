package com.jspider.shapeBasedGame.shape;

import java.util.Scanner;

import com.jspider.shapeBasedGame.threeDShape.ThreeDShape;
import com.jspider.shapeBasedGame.twoDShape.TwoDShape;
import com.jspider.shapeBasedGame.twoDShape.Circle;
import com.jspider.shapeBasedGame.twoDShape.Rectangle;
import com.jspider.shapeBasedGame.twoDShape.Square;
import com.jspider.shapeBasedGame.twoDShape.Triangle;
import com.jspider.shapeBasedGame.threeDShape.Cone;
import com.jspider.shapeBasedGame.threeDShape.Cube;
import com.jspider.shapeBasedGame.threeDShape.Cylinder;
import com.jspider.shapeBasedGame.threeDShape.Sphere;

public class Game {
	Scanner sc=new Scanner(System.in);
	
	public void selectShape() {
		System.out.println("Enter 1 for TwoDShape");
		System.out.println("Enter 2 for ThreeDShape");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("-----Welcome to TwoDShape-----");
			TwoDShape t1=selectTwoDShape();
			t1.getArea();
			t1.getPeremeter();
			t1.getDetails();
			break;
			
		case 2:
			System.out.println("-----Welcome to ThreeDShape-----");
			ThreeDShape t2=selectThreeDShape();
			t2.getTSA();
			t2.getLSA();
			t2.getVol();
			t2.getDetails();
			break;
			
		default:
			System.out.println("------Invalid choice------");
			System.out.println("Select valid choice again....");
			selectShape();
		}
	}
	
	public TwoDShape selectTwoDShape() {
		System.out.println("Enter 1 for Circle");
		System.out.println("Enter 2 for Rectangle");
		System.out.println("Enter 3 for Square");
		System.out.println("Enter 4 for Triangle");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("-----You have selected Circle-----");
			System.out.println("Enter the radius of Circle : ");
			double r=sc.nextDouble();
			return new Circle(r);
		case 2:
			System.out.println("-----You have selected Rectangle-----");
			System.out.println("Enter the lenght of Rectangle : ");
			double len=sc.nextDouble();
			System.out.println("Enter the breadth of Rectangle : ");
			double breadth=sc.nextDouble();
			return new Rectangle(len,breadth);
		case 3:
			System.out.println("-----You have selected Square-----");
			System.out.println("Enter the side of Square : ");
			double side=sc.nextDouble();
			return new Square(side);
		case 4:
			System.out.println("-----You have selected Triangle-----");
			System.out.println("Enter the side1 of Triangle : ");
			double side1=sc.nextDouble();
			System.out.println("Enter the side2 of Triangle : ");
			double side2=sc.nextDouble();
			System.out.println("Enter the side3 of Triangle : ");
			double side3=sc.nextDouble();
			return new Triangle(side1,side2,side3);
		default:
			System.out.println("------Invalid choice------");
			System.out.println("Select valid choice again....");
			return selectTwoDShape();
		}
	}
	
	public ThreeDShape selectThreeDShape() {
		System.out.println("Enter 1 for Cylinder");
		System.out.println("Enter 2 for Cube");
		System.out.println("Enter 3 for Cone");
		System.out.println("Enter 4 for Sphere");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("-----You have selected Cylinder-----");
			System.out.println("Enter the radius of Cylinder : ");
			double r=sc.nextDouble();
			System.out.println("Enter the height of Cylinder: ");
			double h=sc.nextDouble();
			return new Cylinder(r,h);
		case 2:
			System.out.println("-----You have selected Cube-----");
			System.out.println("Enter the side of Cube : ");
			double side=sc.nextDouble();
			return new Cube(side);
		case 3:
			System.out.println("-----You have selected Cone-----");
			System.out.println("Enter the radius of Cone : ");
			double radius=sc.nextDouble();
			System.out.println("Enter the height of Cone : ");
			double height=sc.nextDouble();
			return new Cone(radius,height);
		case 4:
			System.out.println("-----You have selected Sphere-----");
			System.out.println("Enter the radius of Sphere : ");
			double rad =sc.nextDouble();
			return new Sphere(rad);
		default:
			System.out.println("------Invalid choice------");
			System.out.println("Select valid choice again....");
			return selectThreeDShape();
		}
	}
	

}
