package implementingStreamAPI.streamCreation;

import java.util.List;
import java.util.stream.Stream;

public class WayTwo {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,21,4,65,46,4,646,486,7487,8777,987,987,97,987987987,7,77868468,46);
		System.out.println("================================");
		List<Integer> list=stream.distinct().toList();
		System.out.println(list);
		
		
		System.out.println("\n=================================\n");
		Stream<Integer> stream2=Stream.of(1,2,3,4,5,6,7,8,9);
		Object[] nums=stream2.dropWhile(i->i<5).toArray();
		for(Object i:nums) {
			System.out.print(i+" ");
		}
	}

}
