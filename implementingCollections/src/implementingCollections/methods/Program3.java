package implementingCollections.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Program3 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(84);
		list.add(94);
		list.add(74);
		list.add(12);
		list.add(32);
		list.add(79);
		list.add(39);
		list.add(48);
		list.add(25);
		list.add(34);
		list.add(98);
		list.add(88);
		list.add(78);
		System.out.println("Unsorted List");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Sorted List");
		System.out.println(list);
	}

}
