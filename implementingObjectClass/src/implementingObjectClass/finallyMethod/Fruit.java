package implementingObjectClass.finallyMethod;

public class Fruit {
	private String category;
	private Double price;  
	public Fruit() {}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method is called");
	}	
}
