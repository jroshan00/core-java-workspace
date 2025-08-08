package implementingObjectClass.cloneMethod;

public class Main1 {
	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		laptop1.setBrand("Lenovo");
		laptop1.setModel("Vivobook");
		laptop1.setPrice(59999.00);
		
		Laptop laptop2=new Laptop();
		Object o;
		try {
			o = laptop1.clone();
			laptop2=(Laptop)o;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(laptop1);
		System.out.println(laptop2);
	}

}
