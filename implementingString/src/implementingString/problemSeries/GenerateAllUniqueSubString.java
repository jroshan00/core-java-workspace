package implementingString.problemSeries;

import java.util.LinkedHashSet;
import java.util.Set;

public class GenerateAllUniqueSubString {
	public static void main(String[] args) {
		String s="abcab";
		generateAllUniqueSubString(s);
		
	}
	
	public static void generateAllUniqueSubString(String s){
		Set<String> set=new LinkedHashSet<>();
		int n=s.length();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<=n;j++) {
				 set.add(s.substring(i,j));
			}
		}
		for(String s1:set) {
			System.out.println(s1+" ");
		}
		
	}
	


}
