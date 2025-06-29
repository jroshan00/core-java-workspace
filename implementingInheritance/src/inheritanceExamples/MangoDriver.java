
package inheritanceExamples;

public class MangoDriver{
	

	public static void main(String[] args) {
		
		Fruits f1=new Fruits("Summer","Kasmir");
		System.out.println("\n----------O/P-------------\n");
		System.out.println(f1.getDetails());
		System.out.println("\n___________BRAEK______________\n");
		Mango m1=new Mango(40,"Khajli","Summer","UP West");
		System.out.println("\n----------O/P-------------\n");
		System.out.println(m1.getDetails());
		System.out.println("\n____________BREAK_____________\n");
		Mango m2=new Mango(45,"Deshehri","Summer","UP East",12.5);
		System.out.println("\n----------O/P-------------\n");
		System.out.println(m2.getDetails());
		System.out.println("\n------------MAIN EXITS--------------\n");
	}

}
