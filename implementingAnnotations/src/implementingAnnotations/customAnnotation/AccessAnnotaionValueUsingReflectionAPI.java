package implementingAnnotations.customAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AccessAnnotaionValueUsingReflectionAPI {
	
 static void main(String[] args) throws NoSuchMethodException{
		//Class<?> cls=Class.forName("implementingAnnotations.customAnnotation.Demo");
		//Method method=cls.getMethod("show");
		Method method=Demo.class.getMethod("show");

		Annotation annotation=method.getAnnotation(MyAnnotation.class);
		System.out.println(annotation);
		
		System.out.println("==========================");
		
		MyAnnotation myAnnotation=method.getAnnotation(MyAnnotation.class);
		System.out.println(myAnnotation);
		
	}

}
