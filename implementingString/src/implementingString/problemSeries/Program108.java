package implementingString.problemSeries;

public class Program108 {
	
	public static String expand(String str) {
		String result="";
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c >= '0' && c<='9') {
				for(int j=0;j<(c-'0');j++) {
					result=result+str.charAt(i-1);
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str="A3B4";
		System.out.print(str+"--> ");
		str=expand(str);
		System.out.println(str);
		
	}

}
