package implementingSingletonClass.preventionFromBreaking;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Solution2 {
	public static void main(String[] args) {
		try {
			Singleton obj1 = Singleton.getInstance();
			Singleton obj2 = Singleton.getInstance();
			System.out.println("obj1-->" + obj1);
			System.out.println("obj2-->" + obj2);
			System.out.println(obj1 == obj2);
			Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			
			/*
			 * 
			 * IllegalAccessException :- if this Constructor object is enforcing Java
			 * language access control and the underlying constructor is inaccessible.
			 * 
			 * IllegalArgumentException :- if the number of actual and formal parameters
			 * differ; if an unwrapping conversion for primitive arguments fails; or if,
			 * after possible unwrapping, a parameter value cannot be converted to the
			 * corresponding formal parameter type by a method invocation conversion; if
			 * this constructor pertains to an enum class.
			 * 
			 * InstantiationException :- if the class that declares the underlying
			 * constructor represents an abstract class.
			 * 
			 * InvocationTargetException - if the underlying constructor throws an
			 * exception.
			 * 
			 * ExceptionInInitializerError - if the initialization provoked by this method
			 * fails.
			 * 
			 * 
			 */
			Singleton obj3 = constructor.newInstance(); //throws InvocationTargetException() from default constructor body
			System.out.println("obj2-->" + obj2);
			System.out.println("obj3-->" + obj3);
			System.out.println(obj2 == obj3);
		} catch (NoSuchMethodException 
				| InstantiationException 
				| IllegalAccessException 
				| IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
