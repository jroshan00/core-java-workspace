package implementingString.problemSeries;

public class Program76 {
	public static String getUnique(String string){
		String res="";
		int[] freq=new int[26];
		//256 for all usefull characters
		//that can be wrirtten in computer by a programer
		//
		for(char c: string.toCharArray()) {
			freq[c-65]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				res=res+(char)(i+65);
			}
		}
		return res;
	}
	
	public static String getUniqueModified(String string){
		String res="";
		int[] freq=new int[256];
		/*
		 * 256 for all usefull characters
		 * that can be written in computer by a programmer
		 * As per ASCII value so no need to add to add or subtract to c && i variable here
		 */
		for(char c: string.toCharArray()) {
			freq[c]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				res=res+(char)(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		String s="AABBCCDDEEFFGGHH";
		s=getUnique(s);
		System.out.println(s);
		
	}

}
