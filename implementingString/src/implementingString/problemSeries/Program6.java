package implementingString.problemSeries;

public class Program6 {
	public static String test() {
		return "test";
	}
	public static void main(String[] args) {
		// Q. What will be output:
		String s1 = null;
		String test = "test";
		System.out.println(s1 +test);
		System.out.println(s1 +test());
		System.out.println(s1 +"test");

		/*
		 * Ans : nulltest
		 *
		 * Reason : As s1 is having null then it will concatinate null with test
		 */

	}

}
