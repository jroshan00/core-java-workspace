package implementingObjectClass.toString;

public class Main {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setModel("SamsungF24");
		mobile.setBrand("Samsung");
		mobile.setPrice(19999);
		mobile.setRam(8);
		mobile.setRom(2);
		System.out.println(mobile.toString());
	}

}
