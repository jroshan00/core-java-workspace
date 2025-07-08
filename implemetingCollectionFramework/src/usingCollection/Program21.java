package usingCollection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
public class Program21 {
	public static void main(String[] args) {
		Collection<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(1455);
		list.add(140);
		list.add(1);
		list.add(2);
		list.add(111);
		list.add(65);
		list.add(542);
		
		list=list.stream().sorted().toList();
		System.out.println(list);
		System.out.println("========================================");
		list=list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list);
	
	}

}
