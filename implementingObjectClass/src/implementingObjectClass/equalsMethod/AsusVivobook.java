package implementingObjectClass.equalsMethod;

public class AsusVivobook extends Windows{
	private int auxStorage;
	private int cacheMemory;
	

	@Override
	public int getAuxStorage() {
		return this.auxStorage;
	}

	@Override
	public void setAuxStorage(int auxStorage) {
		this.auxStorage=auxStorage;
	}

	@Override
	public int getCacheMemory() {
		return this.cacheMemory;
	}

	@Override
	public void setCacheMemory(int cacheMemory) {
		this.cacheMemory=cacheMemory;
	}
	
	@Override
	public String toString() {
		return "AsusVivobook [auxStorage=" + auxStorage + ", cacheMemory=" + cacheMemory + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}else if(obj==null|| this.getClass()!=obj.getClass()) {
			return false;
		}else {
		AsusVivobook av=(AsusVivobook)obj;
		return this.auxStorage==av.auxStorage && this.cacheMemory==av.cacheMemory;
		}
	}
	
}
