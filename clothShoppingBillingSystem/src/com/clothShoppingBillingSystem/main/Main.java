package com.clothShoppingBillingSystem.main;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.clothShoppingBillingSystem.discountOperations.Discount;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Collection<Double> priceList=new ArrayList<>();
		Collection<String> itemList=new ArrayList<>();
		int n;
		int i=0;
		double sumTotalPrice=0;
		do{
			System.out.println("Enter item name: ");
			String item=sc.next();
			itemList.add(item);
			System.out.println("Enter item price: ");
			double price=sc.nextDouble();
			sumTotalPrice+=price;
			System.out.println("\nEnter 1 to add more items to cart :\nEnter 0 to exit & generate bill :");
			n=sc.nextInt();
		}while(n==1);
		itemList.forEach(item->System.out.println("Selected item is :" + item));
		System.out.println("Total bill is : "+ sumTotalPrice +"\nTotal bill after discount is : " + Discount.getDiscountPrice(sumTotalPrice));
		
		
		
	}

}
