package implementingAbstraction.abstractionWithInheritance;

public abstract class Ios extends OperatingSystem{
	final static String developer="Apple Incorporation";
	final String releaseDate="2007-07-29";
	private String kernelType="Hybrid";
	
	public Ios() {
		super();
	}
	public String getKernelType() {
		return kernelType;
	}
	public void setKernelType(String kernelType) {
		this.kernelType = kernelType;
	}

}
