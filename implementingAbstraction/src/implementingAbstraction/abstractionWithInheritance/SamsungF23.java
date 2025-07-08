package implementingAbstraction.abstractionWithInheritance;

public class SamsungF23 extends Android {

	public SamsungF23() {}
	@Override
	public void getDetails() {
		System.out.println("Android [releaseDate=" + releaseDate + ", kernelType=" + getKernelType() + ", developer="+developer+ "]");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
