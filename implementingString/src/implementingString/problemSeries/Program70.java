package implementingString.problemSeries;

public class Program70 {
	public static String removeDuplicates(String string){
		String res="";
		for(char c:string.toCharArray()) {
			if(res.contains(c+""))
				res=res+c;
		}
		return res;
	}

	public static void main(String[] args) {
		String duplicateValueString="aabcdefffffggghgiiijklmnoopppqrstuvwxyz";
		System.out.println(duplicateValueString);
		System.out.println(removeDuplicates(duplicateValueString));
		System.out.println(duplicateValueString);
		
		
	}

}
