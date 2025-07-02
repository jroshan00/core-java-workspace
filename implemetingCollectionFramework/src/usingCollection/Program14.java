package usingCollection;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Program14 {
	public static void main(String[] args) {
		int[] array=new int[] {2,4,5,7,9,4,6,22,7};
		Long val1=Arrays.stream(array).count();
		OptionalDouble val2=Arrays.stream(array).average();
		Integer val3=Arrays.stream(array).distinct().sum();
		System.out.println("Count of elements :"+val1);
		System.out.println("Average of elements :"+val2.getAsDouble());
		System.out.println("Sum of Unique elements :"+val3);
	}

}
