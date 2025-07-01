package implementingObjectClass.equalsMethod;

public class Main {
	public static void main(String[] args) {
		SamsungF24 mobile1=new SamsungF24();
		SamsungF24 mobile2=new SamsungF24();
		
		mobile1.setAuxStorage(10);
		mobile1.setCacheMemory(12);
		mobile2.setAuxStorage(10);
		mobile2.setCacheMemory(12);
		
		AsusVivobook laptop1=new AsusVivobook();
		AsusVivobook laptop2=new AsusVivobook();
		
		laptop1.setAuxStorage(11);
		laptop1.setCacheMemory(1);
		laptop2.setAuxStorage(11);
		laptop2.setCacheMemory(1);
		
		
		System.out.println(mobile1.equals(mobile2)?"Equal":"Not Equal");
		System.out.println(mobile1.equals(laptop2)?"Equal":"Not Equal");
		System.out.println(laptop1.equals(laptop2)?"Equal":"Not Equal");
		System.out.println(laptop1.equals(mobile2)?"Equal":"Not Equal");
	}

}
