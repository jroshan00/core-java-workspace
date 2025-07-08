package implementingString.problemSeries;

public class Program104 {
	public static void split(String str) {
		String word = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			}
			if (ch == ' ' || i == str.length()-1) {
				if (!(word.isBlank()) && word.length()%2==0)
					System.out.println(word);
				word = "";
			}
		}
	}

	public static void main(String[] args) {
		String str = "  Mohan is here";
		split(str);
	}



}
