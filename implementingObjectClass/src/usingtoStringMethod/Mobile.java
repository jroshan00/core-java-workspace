package usingtoStringMethod;

public class Mobile {
	private String model;
	private String brand;
	private double price;
	private double ram;
	private double rom;
	
	public Mobile() {}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getRom() {
		return rom;
	}
	public void setRom(double rom) {
		this.rom = rom;
	}
	
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + ", ram=" + ram + ", rom=" + rom
				+ "]";
	}
	

}
