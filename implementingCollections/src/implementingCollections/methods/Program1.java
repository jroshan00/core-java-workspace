package implementingCollections.methods;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		dq.offer(84);
		dq.offer(844);
		dq.offer(844);
		dq.offer(844);
		dq.offer(844);
		dq.offer(64);
		dq.offer(64);
		dq.offer(84);
		dq.offer(84);
		dq.offer(84);
		dq.offer(84);
		dq.offer(84);
		dq.offer(84);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to check the frequency : ");
		int num=sc.nextInt();
		int freq=Collections.frequency(dq,num);
		System.out.println(freq);
	}

}
