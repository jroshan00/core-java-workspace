package usingCloneMethod;

public class Laptop implements Cloneable {
	private String brand;
	private String model;
	private Double price;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	/*
	 * A class implements the Cloneable interface to
	 * indicate to the java.lang.Object.clone() method that it
	 * is legal for that method to make a
	 * field-for-field copy of instances of that class.
	 * 
	 * Invoking Object's clone method on an instance that does not implement the
	 * Cloneable interface results in the exception
	 * CloneNotSupportedException being thrown.
	 * 
	 * By convention, classes that implement this interface should override
	 * Object.clone (which is protected) with a public method.
	 * See java.lang.Object.clone() for details on overriding this
	 * method.
	 * 
	*/
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Laptop[ brand: "+brand+" model: "+model+"price: "+price+" ]";
	}
	
}
