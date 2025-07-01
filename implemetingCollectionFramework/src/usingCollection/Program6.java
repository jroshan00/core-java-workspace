package usingCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Collection c=new ArrayList<>();
		c.add(1);c.add(2);c.add(3);c.add(4);
		
		Object[] object=c.toArray(new Object[c.size()]);
		for (int i = 0; i < object.length; i++) {
			Object obj = object[i];
			System.out.println((Integer)obj+10);
			
		}
		
	}

}
