package implementingSet.examplesOnHashSet.withCustomObject;

import java.util.Objects;

public class Mobile implements Comparable<Mobile>{
	private String brand;
	private Double price;
	
	public Mobile() {}
	public Mobile(String brand, Double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return this.brand.equalsIgnoreCase(other.brand) && Objects.equals(price, other.price);
	}
	@Override
	public int compareTo(Mobile mobile) {
		return (int)(this.price-mobile.price);
	}

}
