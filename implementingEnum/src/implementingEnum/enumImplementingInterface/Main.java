package implementingEnum.enumImplementingInterface;

public class Main {
	public static void main(String[] args) {
		System.out.println("===========================");
		Language.ENGLISH.greet();
		System.out.println("===========================");
		Language.HINDI.greet();
		System.out.println("===========================");
		System.out.println(Language.ENGLISH.getMessage());//null
		System.out.println("===========================");
		System.out.println(Language.SPANISH.getMessage());//Spanish language is being used
		System.out.println("===========================");
		System.out.println(Language.HINDI.getMessage());//null
		System.out.println("===========================");
		
	}
}
