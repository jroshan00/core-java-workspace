package usingCollection;

import java.util.Arrays;

public class Program15 {
	public static void main(String[] args) {
		int[] array=new int[] {2,4,5,7,9,4,6,22,7};
		array=Arrays.stream(array).sorted().distinct().toArray();
		for(int x:array) {
			System.out.print(x+" ");
		}
	}
}
