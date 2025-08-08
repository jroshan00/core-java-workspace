package implementingList.examplesOnArrayListWithCustomObject;

import java.util.Objects;

public class Car {

	private Double price;
	private String color;
	private String name;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + ", color=" + color + "]";
	}

	public Car(Double price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price);
	}

}
