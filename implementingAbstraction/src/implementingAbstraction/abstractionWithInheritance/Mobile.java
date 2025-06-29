package implementingAbstraction.abstractionWithInheritance;

public abstract class Mobile implements Device { 
	String brand;
	String network;
	boolean wifi;
	String camera;

	public Mobile() {}
	
	public Mobile(String brand,String network) {
		this();
		this.brand=brand;
		this.network=network;
	}
	
	//CopyConstructor
	public Mobile(Mobile m1) {
		this.brand=m1.brand;
		this.camera=m1.camera;
		this.wifi=m1.wifi;
		this.network=m1.network;
	}
	
	//Constructor Overloading
	public Mobile(String brand,String network,boolean wifi,String camera) {
		this(brand,network); //Constructor Chaining
		this.wifi=wifi;
		this.camera=camera;
	}

}
