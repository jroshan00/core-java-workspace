package implementingSingletonClass.breakingSingletonClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Problem1 {
	public static void main(String[] args) {
		Singleton obj1=Singleton.getInstance();
		ObjectOutputStream out=null;
		ObjectInputStream in=null;
		File file=new File("D:\\core-java-problem-solving\\fileHandlingProgram\\sample-file\\class_address_keeper.txt");
		try{
			out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(obj1);
			in = new ObjectInputStream(new FileInputStream(file));
			Singleton obj2 = (Singleton) in.readObject();
			System.out.println("obj1 -> "+obj1);
			System.out.println("obj1 -> "+obj2);
			System.out.println("obj1==obj2 : "+ (obj1==obj2));//false
		} catch (IOException | ClassNotFoundException  e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
