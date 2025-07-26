package implementingAnnotations.repeatingAnnotation;

public class Demo {
	@Hint(hintValue = "Hello")
	@Hint(hintValue = "Roshan")
	public void show() {
		System.out.println("show method is called...");
	}

}
