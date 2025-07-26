package implementingAnnotations.customAnnotation;

public class Demo {
	
	@MyAnnotation(value="MyAnnotation", count=1)
	public void show() {
		System.out.println("show() method is called.....");
	}
//	
//	public static void main(String[] args) {
//		show();
//	}

}
