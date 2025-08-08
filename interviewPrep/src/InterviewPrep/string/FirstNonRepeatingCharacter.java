package InterviewPrep.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacter {
	
	public static Character getFirstNonRepeatingCharacter(String str) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char c:str.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		Set<Character> set=map.keySet();
		for(char c:set) {
			int value=map.get(c);
			if(value==1) {
				return c;
			}
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		String str="HHeelloWWorrlld";//d
		System.out.println(getFirstNonRepeatingCharacter(str));
	}

}
