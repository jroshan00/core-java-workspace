package implementingAnnotations.customAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Custom annotations can be created using @interface.
 * In Java, annotations must be defined using the @interface keyword — 
 * there is no other way to create annotations. 
 * This is the only valid syntax for defining custom annotations in Java.
 * 
 * Why only @interface?
 * Java annotations are not interfaces in the traditional sense. 
 * The @interface keyword is a special Java construct that tells the compiler:
 * "This is not a regular interface — this is an annotation type."
 * 
 * Behind the Scenes : 
 * Even though you use @interface, annotations are internally compiled into interfaces that extend java.lang.annotation.Annotation.
 * But from a developer perspective, you can't use interface or class to define an annotation — the compiler will throw an error.
 * 
 */

@Retention(RetentionPolicy.RUNTIME)		//  Available at runtime
@Target(ElementType.METHOD)  	// Can be used on methods only
public @interface MyAnnotation {
	
	String value();
	public int count() default 1;
}
