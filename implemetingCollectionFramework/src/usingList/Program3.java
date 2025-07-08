package usingList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(122);
		l.add(192);
		l.add(120);
		l.add(172);
		System.out.println("Enter the index value  :");
		int index=sc.nextInt();
		System.out.println("Before removing from index ");
		System.out.println(l);
		l.remove(index);
		System.out.println("After removing from index ");
		System.out.println(l);
	}

}
