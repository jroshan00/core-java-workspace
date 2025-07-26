package implementingAnnotations.repeatingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;

@Repeatable(Hints.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hint {
	String hintValue();
}
