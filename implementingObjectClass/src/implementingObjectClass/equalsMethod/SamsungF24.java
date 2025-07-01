package implementingObjectClass.equalsMethod;

public class SamsungF24 extends Android {
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
	public String toString(){
		return "[auxStorage : "+ auxStorage+" ,cacheMemory : "+cacheMemory+" ]";
	}
	
	@Override
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}else if (!(obj instanceof SamsungF24) || obj==null){
			return false;
		}
		SamsungF24 smg=(SamsungF24)obj;
		return this.auxStorage==smg.auxStorage && this.cacheMemory==smg.cacheMemory;
	}

}
