package implementingAbstraction.abstractionWithInheritance;

public abstract interface Device extends Object{
	String maxStorageCapacity="250GB";
	
	//static methods are allowed in interface
	public static void properties() {
		System.out.println("RAM");
		System.out.println("ROM");
		System.out.println("CPU");
		System.out.println("Memory");
		System.out.println("I/O");
	}
	
	//default methods are allowed in interface
	public default String getStorageCapacity() {
		System.out.println("Storage Capacity");
		return maxStorageCapacity;
	}

}
