package implementingAnnotations.customAnnotationWithEnum;

import java.lang.reflect.Method;

public class AccessingAnnotationWithReflection {
	public static void main(String[] args) throws NoSuchMethodException {
		Method method=Main.class.getMethod("showSignal");
		IntrinsicValue annotation=method.getAnnotation(IntrinsicValue.class);
		System.out.println("Signal passed was : "+ annotation.value());
	}

}
