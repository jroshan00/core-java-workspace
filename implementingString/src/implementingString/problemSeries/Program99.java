package implementingString.problemSeries;

public class Program99 {
	
	public static void print(String[] array) {
		for (int i = 0; i < array.length; i++) {
			String string = array[i];
			System.out.println(string);
		}
	}
	
	public static String[] split1(String str) {
		return str.trim().split("\s+");
	}
	
	public static void split2(String str) {
		String word="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' '){
				word=word+ch;
			}
			if(ch==' ' || i==str.length()-1 /*&& !(word.isBlank())*/) {
				if(!(word.isBlank())) {
					System.out.println(word);
					word="";
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String str="  Mohan is here";
		print(split1(str));
		System.out.println("=================");
		split2(str);
	}

}
