package implementingString.problemSeries;

import java.util.Arrays;

public class Program103 {

	public static void split(String str) {
		Arrays.stream(str.trim().split("\s+")).forEach(s->System.out.println(s));
	}

	public static void main(String[] args) {
		String str = "  Mohan is here";
		split(str);
	}

}
