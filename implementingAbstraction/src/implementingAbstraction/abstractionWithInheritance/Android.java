package implementingAbstraction.abstractionWithInheritance;

public abstract class Android extends OperatingSystem{
	final static String developer="Google LLC";
	final String releaseDate="2008-09-23";
	private String kernelType="Linux-based";

	public Android() {
		super();
	}
	
	public String getKernelType() {
		return kernelType;
	}
	public void setKernelType(String kernelType) {
		this.kernelType = kernelType;
	}
	
}
