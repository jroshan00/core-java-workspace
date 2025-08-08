package InterviewPrep.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintFrequnecyOfCharacters {
	public static void main(String[] args) {
		String s="aaabbbbccccdddeefffghiii";
		Map<Character,Integer> map=new HashMap<>();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			int val=map.getOrDefault(c,0);
			map.put(c, val+1);
		}
		
		Set<Character> keys=map.keySet();
		for(char key:keys) {
			if(map.get(key)==1) {
				System.out.println(key+" : "+ map.get(key));
			}
		}
	}
}
