package implementingSingletonClass.preventionFromBreaking;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	/**
	 * Default value of {@value #serialVersionUID} provided for serialization purpose.
	 * JVM purpose
	 */
	private static final long serialVersionUID = 1L;

	private static Singleton instance;

	private Singleton() {
		/*
		 * Case 2 : Using Reflection(java.lang.reflect.Constructor)
		 * 
		 * Can access private constructor to create a new instance.So when instance is not
		 * null which is in Method area. So it will throw new InvocationTargetException() 
		 * 
		 * Basically added Add a check in constructor to prevent multiple instantiations.
		 */
		if(instance!=null) {
			throw new RuntimeException("Use getInstance()");
		}
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	/*
	 * Case 1 : Serialization
	 * 
	 * readResolve() is a special method used in Java Serialization. It’s called
	 * after an object is deserialized, and it allows you to replace the
	 * deserialized object with something else — typically, in Singleton, we return
	 * the existing instance, so we don’t get a second one after deserialization.
	 * 
	 */
	
	//Here's the readResolve method
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
	
	/*
	 * Case 3 : Cloneable
	 * 
	 * clone() creates a duplicate object.
	 * Override clone() and throw exception (or return same instance if needed).
	 * 
	 */
	@Override
	public Object clone() throws CloneNotSupportedException{
		return instance;
	}
	
}
