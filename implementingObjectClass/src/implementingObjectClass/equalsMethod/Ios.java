package implementingObjectClass.equalsMethod;

public abstract class Ios implements OperatingSystem {
	
	public Ios() {
		super();
	}
	
	public abstract int getAuxStorage();
	public abstract void setAuxStorage(int auxStorage);
	public abstract int getCacheMemory();
	public abstract void setCacheMemory(int cacheMemory);
	

}
