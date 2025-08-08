package implementingMap.map;

import java.util.Set;

import implementingMap.map.MyMap.MyEntry;

public class Main1 {
	
	public static void main(String[] args) {
		MyMap<Integer,String> studentList1=new MyHashMap<>();
		studentList1.put(16, "Roshan Pandey");
		studentList1.put(33, "Rohan Vatts");
		studentList1.put(49, "Rajib Mishra");
		studentList1.put(32, "Rajib Mishra");
		
		System.out.println(studentList1);
		System.out.println("Size : "+studentList1.size());
		
		Set<MyEntry<Integer,String>> studentEntrySet1=studentList1.entrySet();
		for(MyEntry<Integer,String> entry:studentEntrySet1) {
			System.out.println(entry);
		}
		
		System.out.println("=====================");
		
		MyMap<Integer,String> studentList2=new MyHashMap<>();
		studentList2.put(16, "Roshan Pandey");
		studentList2.put(33, "Rohan Vatts");
		studentList2.put(49, "Rajib Mishra");
		studentList2.put(32, "Rajib Mishra");
		
		System.out.println(studentList2);
		System.out.println("Size : "+studentList2.size());
		
		Set<MyEntry<Integer,String>> studentEntrySet2=studentList2.entrySet();
		
		for(MyEntry<Integer,String> entry:studentEntrySet2) {
			System.out.println(entry);
		}
		
		System.out.println(studentEntrySet1.equals(studentEntrySet2));
		
		
	}

}
