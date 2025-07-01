package implementingObjectClass.equalsMethod;

public interface OperatingSystem {
	byte x=127;
	
	static int getStorageCapacity(){
		return (int)getSize()*1024;
	}
	
	private  static byte getSize() {
		return x;
	}
}
