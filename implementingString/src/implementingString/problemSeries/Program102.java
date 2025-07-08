package implementingString.problemSeries;

public class Program102 {

	public static void split(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			}
			if (ch == ' ' || i == 0) {
				if (!(word.isBlank())) {
					System.out.println(word);
					word = "";
				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "  Mohan is here";
		split(str);
	}

}
