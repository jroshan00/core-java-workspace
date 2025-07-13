package usingList;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("hello");
		list.add("ufo");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===============");
		System.out.println(list.remove("hello")?"removed":"not removed");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
