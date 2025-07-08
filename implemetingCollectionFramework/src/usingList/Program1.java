package usingList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(1455);
		list.add(140);
		list.add(1);
		list.add(2);
		list.add(111);
		list.add(65);
		list.add(542);
		
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
	}
}
