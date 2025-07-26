package implementingAnnotations.inheritedAnnotation;

@Role(value="Admin")
//@Role(value="User")
public class User {
	public void show() {
		System.out.println("show called...");
	}
}
