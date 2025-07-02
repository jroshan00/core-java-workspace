package usingCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Program13 {
	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<>();
		c.add(51);
		c.add(51);
		c.add(81);
		c.add(81);
		c.add(71);
		c.add(71);
		c.add(71);
		c.add(50);
		c.add(50);
		c.add(80);
		c.add(80);
		c.add(70);
		c.add(70);
		List<Integer> l=c.stream().sorted().collect(Collectors.toList());
		c=c.stream().sorted().distinct().toList();
		//List<Integer> l=c.stream().sorted().toList();
		System.out.println(l);
		System.out.println(c);
	}

}
