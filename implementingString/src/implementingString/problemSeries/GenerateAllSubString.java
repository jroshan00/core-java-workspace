package implementingString.problemSeries;

public class GenerateAllSubString {
	public static void main(String[] args) {
		String s="abc";
		generateAllSubString(s);
		
	}
	
	public static void generateAllSubString(String s){
		int n=s.length();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<=n;j++) {
				 System.out.println(s.substring(i,j));
			}
		}
		
	}
	

}
