package InterviewPrep.string;

import java.util.ArrayList;
import java.util.Iterator;

public class AllSubSetsOfAString {
	
	public static void main(String[] args) {
		String str="abcd";
		ArrayList<ArrayList<Character>> res=new ArrayList<>();
		getAllSubsets(str, 0, new ArrayList<>(), res);
		for (Iterator<ArrayList<Character>> iterator = res.iterator(); iterator.hasNext();) {
			ArrayList<Character> arrayList = iterator.next();
			System.out.println(arrayList);
		}
		
	}
	public static void getAllSubsets(String str,int index,ArrayList<Character> current,ArrayList<ArrayList<Character>> res) {
		char[] ch=str.toCharArray();
		if(index==ch.length) {
			res.add(new ArrayList<>(current));
			return;
		}
		//adding element
		current.add(ch[index]);
		getAllSubsets(str, index+1, current, res);
		
		//removing element 
		current.remove(current.size()-1);
		getAllSubsets(str, index+1, current, res);
	}
}

