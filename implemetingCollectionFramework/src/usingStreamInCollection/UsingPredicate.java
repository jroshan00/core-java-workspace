package usingStreamInCollection;
import java.util.Arrays;
//import java.util.function.*;
import java.util.stream.*;


public class UsingPredicate {

	public static void main(String[] args) {
		
		int n[]= {10,100,400};
		IntStream s1= Arrays.stream(n);  //Converting each int type element into object type
		s1.forEach(x->System.out.println(x));

	}

}
