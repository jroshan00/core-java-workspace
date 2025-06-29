package usingList;

import java.util.ArrayList;
import java.util.List;



public class UsingArrayList {

	public UsingArrayList() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(12);
		
		List<Integer> l2=new ArrayList<>(10);
		l2.add(13);
		System.out.println("size of list list l1 : "+l1.size());
		System.out.println("size of list list l2 : "+l2.size());
		
		
	}

}
