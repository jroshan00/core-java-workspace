package com.clothShoppingBillingSystem.discountOperations;

public class Discount {
	public static double getDiscountPrice(double price) {
		if(price>=10000)
			return price-price*0.40;
		else if(price<10000 && price >=6000)
			return price-price*0.30;
		else if(price<6000 && price >=3000)
			return price-price*0.18;
		else if(price<3000 && price >=1)
			return price-price*0.08;
		return price;
		
	}

}
