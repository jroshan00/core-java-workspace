package implementingAbstraction.abstractionWithInheritance;

public class Driver {

	public static void main(String[] args) {
		/*
		 * NOT ALLOWED AS Object IS AN INTERFACE AND MOBILE IS ABSTRACT CLASS
		 * Object o1=new Object();
		Device d1=new Device();
		Device d2=new Device("Samsung","5G",true,"50MP");
		
		Device d1=new Mobile("Micromax","3G");
		Device d2=new Mobile("Samsung","5G",true,"50MP");
		
		Object o1=new Object();
		*/
		
		Object o1=new SamsungF23();
		o1.getDetails();
		SamsungF23 s1=(SamsungF23)o1;
		System.out.println("Storage capacity : "+SamsungF23.maxStorageCapacity);
	}
	

}
