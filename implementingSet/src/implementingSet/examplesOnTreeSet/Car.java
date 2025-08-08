package implementingSet.examplesOnTreeSet;

public class Car implements Comparable<Car> {
	private Double price;
	private String name;
	private String color;

	public Car() {}
	
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
	public String toString() {
		return "Car [price=" + price + ", name=" + name + ", color=" + color + "]";
	}

//	@Override
//	public int compareTo(Car car) {
//		return (int) (this.price-car.price);
//	}
	@Override
	public int compareTo(Car car) {
		if(this.price==car.price) {
			return this.name.toLowerCase().compareTo(car.name.toLowerCase());
		}else if(this.name.equalsIgnoreCase(car.name)) {
			return (this.color.toLowerCase().compareTo(car.color.toLowerCase()));
		}else {
			return (int) (this.price-car.price);
		}
	}

}
