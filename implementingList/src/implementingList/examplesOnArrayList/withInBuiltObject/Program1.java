package implementingList.examplesOnArrayList.withInBuiltObject;

import java.util.AbstractList;
import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		AbstractList<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(15);
		System.out.println("Program1.main()");
		System.out.println(list);
	}

}
