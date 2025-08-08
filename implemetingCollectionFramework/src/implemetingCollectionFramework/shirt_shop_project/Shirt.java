package implemetingCollectionFramework.shirt_shop_project;

import java.util.Objects;

public class Shirt {
	String brand;
	SizeType sizeType;
	String color;
	Double price;

	public Shirt(String brand, SizeType sizeType, String color, Double price) {
		super();
		this.brand = brand;
		this.sizeType = sizeType;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shirt [ brand : " + this.brand + ", sizeType : " + this.sizeType + ", color : " + this.color + ", price : "
				+ this.price + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, sizeType, color, price);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Shirt shirt = (Shirt) o;
		return this.brand.equalsIgnoreCase(shirt.brand) && this.color.equalsIgnoreCase(shirt.color)
				&& this.price == shirt.price && this.sizeType == shirt.sizeType;
	}
}
