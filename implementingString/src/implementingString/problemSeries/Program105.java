package implementingString.problemSeries;

public class Program105 {
	public static String getWord(String str) {
		String word="";
		String finalWord="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c!=' ') {
				word=word+c;
			}
			if(c==' ' || i==str.length()-1) {
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
