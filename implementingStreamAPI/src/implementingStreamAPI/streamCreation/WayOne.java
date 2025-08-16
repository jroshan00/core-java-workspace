package implementingStreamAPI.streamCreation;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class WayOne {
	
	public static void main(String[] args) {
		//In case of array of primitive data type....
		int[] num= {1,4,78,9,9,5,45,6,6,85,4,8,84,4,22,6,5,45,4,5,5,54,1,122,5,5,4,4,2,12,254,1,};
		IntStream intStream=Arrays.stream(num);
		intStream.sorted().forEach(n->System.out.print(n+" "));
		
		System.out.println("\n================================\n");
		
		//In case of non primitive datatype....
		String[] dogs= {" Harman "," Rocky ","  Rock","   Pipo","Heller  "};
		Stream<String> stream=Arrays.stream(dogs);
		stream.map((str)->str.trim()).forEach((str)->System.out.print(str+" "));
	}
}
