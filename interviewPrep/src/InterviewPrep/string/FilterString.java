package InterviewPrep.string;

public class FilterString {
	
	public static void main(String[] args) {
		String str="3ad45pq90";
		str=filterNumbericValue(str);
		System.out.println("after filteration : "+str);
		
	}
	
	public static String filterNumbericValue(String str) {
		if( str==null) return null;
		char[] ch=str.toCharArray();
		String res="";
		for(char c:ch) {
			if(c>='0' && c<='9') {
				res=res+c;
			}
		}
		return res;
		
	}

}
