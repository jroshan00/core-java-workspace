package implementingMap.examplesOnMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program2 {
	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(100001, "Roshan Pandey");
		students.put(100002, "Vraj Bharskar");
		students.put(100003, "Mohan Nigam");
		students.put(100004, "Rahul Jain");
		students.put(100005, "Ankush Bhati");
		students.put(100006, "Tim Jha");
		
		System.out.print(students);
		
		System.out.println("\n==================");
		
		Set<Entry<Integer,String>> entrySet=students.entrySet();
		for(Entry<Integer,String> entry:entrySet) {
			if(entry.getValue()==null) {
				entry.setValue("Null");
			}
			System.out.println("[ "+entry+" ]");
		}
	}

}
