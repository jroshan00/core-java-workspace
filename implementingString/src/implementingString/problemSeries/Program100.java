package implementingString.problemSeries;

public class Program100 {
	
	public static void split(String str) {
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				word = word.append(ch);
			}
			if (ch == ' ' || i == str.length() - 1 /* && !(word.isBlank()) */) {
				if (!(word.toString().isBlank())) {
					System.out.println(word);
					word = word.delete(0,word.length());
				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "  Mohan is here";
		split(str);
	}

}
