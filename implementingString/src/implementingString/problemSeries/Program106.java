package implementingString.problemSeries;

public class Program106 {
	
	public static String getWord(String str) {
		String word="";
		String finalWord="";
		for(int i=str.length()-1;i>=0;i--) {
			char c=str.charAt(i);
			if(c!=' ') {
				word=c+word;
			}
			if(c==' ' || i==0) {
				if(!(word.isBlank())){
					finalWord=finalWord+" "+word;
					word="";
				}
			}
		}
		return finalWord.trim();
	}
	
	public static void main(String[] args) {
		String str=" Mohan is here ";
		System.out.println(getWord(str));
	}



}
