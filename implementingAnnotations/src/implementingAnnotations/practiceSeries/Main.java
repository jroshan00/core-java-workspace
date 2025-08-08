package implementingAnnotations.practiceSeries;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
	
	@City(value=Places.Delhi)
	public static void myPlaces() {
		System.out.println("Places is called....");
	}
	public static void main(String[] args) {
		try {
			Method method=Main.class.getDeclaredMethod("myPlaces");
			Annotation annotaion = method.getAnnotation(City.class);
			System.out.println(annotaion.annotationType().getName());
		}catch(NoSuchMethodException e) {
			
		}
		
	}

}
