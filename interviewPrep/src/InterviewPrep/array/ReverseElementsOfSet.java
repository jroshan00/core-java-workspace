package InterviewPrep.array;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Set;

public class ReverseElementsOfSet {
	public static void main(String[] args) {
		Set<Integer> set=new LinkedHashSet<>();
		set.add(12);
		set.add(45);
		set.add(50);
		set.add(61);
		set.add(87);
		set.add(91);
		set.add(100);
		set.add(123);
		set.add(132);
		System.out.println(set);
		LinkedHashSet<Integer> linkedSet=(LinkedHashSet<Integer>)set;
		SequencedSet<Integer> sSet=linkedSet.reversed();
		System.out.println(sSet);
	}
}
