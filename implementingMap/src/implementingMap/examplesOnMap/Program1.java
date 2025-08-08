package implementingMap.examplesOnMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Program1 {
	public static void main(String[] args) {
		Map<Integer, String> students=new HashMap<>();
		students.put(100001, "Roshan Pandey");
		students.put(100002, "Vraj Bharskar");
		students.put(100003, "Mohan Nigam");
		students.put(100004, "Rahul Jain");
		students.put(100005, "Ankush Bhati");
		students.put(100006, "Tim Jha");
		Set<Integer>keys=students.keySet();
		for(Integer i:keys) {
			System.out.println(i+" : "+students.getOrDefault(i, null));
		}
		
		System.out.println(students.get(1));
		//System.out.println(students.get("54"));
	}

}
