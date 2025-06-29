package implementingAbstraction.abstractionWithInheritance;

public class Iphone14 extends Ios {

	public Iphone14() {}
	
	@Override
	public void getDetails() {
		System.out.println("Ios [releaseDate=" + releaseDate + ", kernelType=" + getKernelType() + ", developer="+developer+ "]");
		
	}
}
