package implementingSingletonClass.preventionFromBreaking;

public class Solution3 {

	/*
	 * Problem: clone() creates a duplicate object. 
	 * 
	 * Prevention: Way 1
	 * 
	 * @Override 
	 * protected Object clone() throws CloneNotSupportedException { 
	 * 		throw new CloneNotSupportedException("Cloning not allowed"); 
	 * }
	 * 
	 * Prevention: Way 2
	 * 
	 * @Override
	 * public Object clone() throws CloneNotSupportedException{
	 * 		return instance;
	 * }
	 * 
	 */

	public static void main(String[] args) {
		try {
			Singleton instance1 = Singleton.getInstance();
			Singleton instance2 = (Singleton) instance1.clone(); // throws new CloneNotSupportedException()
			System.out.println("(instance1==instance2) :- " + (instance1 == instance2)); //true
		} catch (CloneNotSupportedException e) {

		}

	}

}
