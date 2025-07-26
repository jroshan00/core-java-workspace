package implementingAnnotations.repeatingAnnotation;

import java.lang.reflect.Method;

public class Main {
	/*
	 * Accessing Repeating Hint hintValue passed through show method.
	 * 
	 */
	public static void main(String[] args) throws NoSuchMethodException {
		Method method=Demo.class.getMethod("show");
		Hint[] annotation=method.getAnnotationsByType(Hint.class);
		for(Hint hint:annotation) {
			System.out.println(hint.hintValue());
		}
	}
}
