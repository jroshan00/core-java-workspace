package implementingSingletonClass.preventionFromBreaking;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution1 {
	/**
	 * Serialization
	 * 
	 * Problem: Deserialization creates a new instance.
	 * 
	 * Resolution : In Singlton class which implements Serialization Marker interfece
	 * <code> 
	 * private Object readResolve() throws ObjectStreamException {
	 * 		return instance;
	 * }
	 * </code>
	 * 
	 */
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		ObjectOutputStream out = null;
		ObjectInputStream in = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("file.obj"));
			out.writeObject(instance1);

			in = new ObjectInputStream(new FileInputStream("file.obj"));
			Singleton instance2 = (Singleton) in.readObject();

			System.out.println("(instance1==instance2) : -> " + (instance1 == instance2)); //true

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}

		}
	}

}
