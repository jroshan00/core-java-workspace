package implementingQueue.examplesOnPriorityQueue;

public class Laptop implements Comparable<Laptop> {
	private String brand;
	private double price;
	
	public Laptop() {}
	public Laptop(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptop other) {
		if(this.price==other.price) {
			return this.brand.compareTo(other.brand);
		}
		return (int)(this.price-other.price);
	}

}
