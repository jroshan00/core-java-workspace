package usingMap;

import java.util.Objects;

public class Product {
	String brand;
	String productName;
	double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String brand,String productName,double price){
		this.brand=brand;
		this.productName=productName;
		this.price=price;
	}
	@Override
	public boolean equals(Object obj) {
		Product p=(Product)obj;
		if(this==obj)
			return true;
		if(obj==null || this.getClass()!=obj.getClass())
			return false;
		else {
			
			return this.brand==p.brand && this.price==p.price && this.productName.equalsIgnoreCase(productName);
		}
	}
	
	
	//way 1
	@Override
	public int hashCode() {
		return Objects.hash(price,brand,productName);
	}
	
//	way 2
	
//	@Override
//	public int hashCode() {
//		return this.price;
//	}

}
