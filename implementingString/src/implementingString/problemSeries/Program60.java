package implementingString.problemSeries;

public class Program60 {
	/*
	 * Write a program in Java to remove path information from a filename returning
	 * only its file component.
	 * 
	 * i/p: "c:\JavaProgram\demo1.txt“ 
	 * o/p: demo1.txt
	 * 
	 */
	
	public static String getfileName(String str) {
		String[] s=str.split("\\\\");
		return s[s.length-1];
	}
	
	public static void main(String[] args) {
		String str="c:\\JavaProgram\\demo1.txt";
		System.out.println("File name : "+getfileName(str));
	}

}
