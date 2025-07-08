package implemetingCollectionFramework.assessmentPrograms;

import java.util.Collection;
import java.util.Vector;
import java.util.Iterator;

public class Program5 {
	
	public static void main(String[] args) {
		/*
		 * WAJP to create a collection and print and count 
		 * all the three digit integers available in collection.
		 * 
		 */
		Collection<Integer> collection=new Vector<>();
		collection.add(101);
		collection.add(4);
		collection.add(5135);
		collection.add(1115);
		collection.add(325);
		collection.add(415);
		collection.add(65465);
		collection.add(45);
		collection.add(6);
		collection.add(65);
		//Way : 1
		collection.stream().filter(n->(""+n).length()==3).forEach(n->System.out.println(n));
		int count=(int)collection.stream().filter(x->(""+x).length()==3).count();
		System.out.println("Total count of three digit is : "+count);
		
		//way : 2
		System.out.println("====================");
		int totalThreeDigitCount=0;
		for(Integer x:collection) {
			count=0;
			int temp=x;
			while(temp>0){
				temp/=10;
				count++;
			}
			if(count==3) {
				totalThreeDigitCount++;
				System.out.println(x);
			}
		}
		System.out.println("Total count of three digit is : "+totalThreeDigitCount);
		
		
		//Way : 3
		System.out.println("====================");
		totalThreeDigitCount=0;
		Iterator<Integer> itr=collection.iterator();
		while(itr.hasNext()) {
			int x=itr.next();
			if(x>99 && x<999) {
				totalThreeDigitCount++;
				System.out.println(x);
			}
		}
		System.out.println("Total count of three digit is : "+totalThreeDigitCount);
		
		//Way : 4
		System.out.println("====================");
		totalThreeDigitCount=0;
		//Integer[] nums=(Integer[])collection.toArray(); //ClassCastException
		//Object[] nums=collection.toArray(); // can be stored in Object[] as its return type this only.
		Integer[] nums=(Integer[])collection.toArray(new Integer[0]);
		for(int i=0;i<nums.length;i++) {
			if(nums[i].toString().length()==3){
				totalThreeDigitCount++;
				System.out.println(nums[i]);
			}
		}
		System.out.println("Total count of three digit is : "+totalThreeDigitCount);
	}

}
