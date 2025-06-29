package usingMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	/*
	 * String class is inbuilt special class and has it's own hashCode() and equals() method already
	 * overriden by the Oracle team.
	 * 
	 * But When we create user defined class the it uses hashCode()
	 * and equals() method of Object class which needs to be overriden 
	 * if we want to make object reference variable value dependent while instatiation.
	 * 
	 */
	public static void main(String[] args) {
		Map<String,Integer> m1= new HashMap<>();
		String s1="Mohan";
		String s2="Sohan";
		String s3="Mohan";
		
		m1.put(s1, 101);
		m1.put(s2, 102);
		m1.put(s3, 104);
		System.out.println(m1);
		System.out.println("s1.equals(s3)--->"+s1.equals(s3));
		System.out.println("s2.equals(s3)--->"+s2.equals(s3));
		System.out.println("-------------------");
		
		Map<String,Integer> m2= new HashMap<>();
		String s4=new String("Mohan");
		String s5=new String("Sohan");
		String s6=new String("Mohan");
		
		m2.put(s4,1011);
		m2.put(s5,1015);
		m2.put(s6,1016);
		System.out.println(m2);
		System.out.println("s4.equals(s6)--->"+s4.equals(s6));
		System.out.println("s5.equals(s6)--->"+s5.equals(s6));
		System.out.println("-------------------");
		
		
		
	}

}
