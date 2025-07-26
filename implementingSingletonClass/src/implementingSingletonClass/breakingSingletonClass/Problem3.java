package implementingSingletonClass.breakingSingletonClass;

public class Problem3 {
	public static void main(String[] args) {
		/*
		 * If the Singleton class implements Cloneable and overrides the clone() method as public, 
		 * then instance.clone() is legal.
		 * 
		 * So we that can break singleton class with clone() method of Object class.
		 * 
		 */
		
		try {
			Singleton instance1=Singleton.getInstance();
			Singleton instance2 = (Singleton) instance1.clone();
			System.out.println("(instance1==instance2) :- "+(instance1==instance2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		
	}

}
