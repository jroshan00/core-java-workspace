package implementingObjectClass.equalsMethod;

public abstract class Android implements OperatingSystem {
	
	Android(){
		super();
	}
	
	public abstract int getAuxStorage();
	public abstract void setAuxStorage(int auxStorage);
	public abstract int getCacheMemory();
	public abstract void setCacheMemory(int cacheMemory);
	

}
