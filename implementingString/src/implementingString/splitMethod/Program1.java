package implementingString.splitMethod;


public class Program1 {
	public static void main(String[] args) {
		String s="jroshanpandey@gmail.com";
		String p="implementingString.splitMethod.Program1";
		String r="D:\\core-java-problem-solving\\String";
		String t="core java problem solving String";
		
		System.out.println("==================================");
		String[] str=s.split("[@]");
		System.out.println("String[] length : "+str.length);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("==================================");
		str=p.split("\\.");
		System.out.println("String[] length : "+str.length);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("==================================");
		str=r.split("\\\\");
		System.out.println("String[] length : "+str.length);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("==================================");
		str=t.split(" ");
		System.out.println("String[] length : "+str.length);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
