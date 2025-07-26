package implementingSingletonClass.breakingSingletonClass;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singleton instance;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
