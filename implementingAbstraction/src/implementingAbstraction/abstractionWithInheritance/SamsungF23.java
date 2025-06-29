package implementingAbstraction.abstractionWithInheritance;

public class SamsungF23 extends Android {

	public SamsungF23() {}
	@Override
	public void getDetails() {
		System.out.println("Android [releaseDate=" + releaseDate + ", kernelType=" + getKernelType() + ", developer="+developer+ "]");
	}

}
