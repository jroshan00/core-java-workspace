package implementingSet.examplesOnHashSet.withCustomObject;
import java.util.Objects;

public class Car{
	private Double price;
	private String name;
	private String color;

	public Car() {
	}

	public Car(Double price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}else if(this.getClass()!=obj.getClass() || obj==null) {
			return false;
		}
		Car car=(Car)obj;
		return this.price.equals(car.price) && this.name.equalsIgnoreCase(car.name) && this.color.equalsIgnoreCase(car.color);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,color,price);
	}
	
	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + ", color=" + color + "]";
	}
}
