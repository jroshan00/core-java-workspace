package implementingList.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		MyArrayList<Integer> myArrayList=new MyArrayList<>();
		ArrayList<Integer> arrayList=new ArrayList<>();
		System.out.println("==============ArrayList<>============");
		arrayList.add(12);
		arrayList.add(65);
		Iterator<Integer> arrayListIterator=arrayList.iterator();
		while(arrayListIterator.hasNext()) {
			System.out.print(arrayListIterator.next()+" ");
		}
		myArrayList.add(12);
		myArrayList.add(23);
		myArrayList.add(28);
		myArrayList.add(298);
		myArrayList.add(918);
		myArrayList.add(12);
		myArrayList.add(987);
		myArrayList.add(354);
		myArrayList.add(768);
		myArrayList.add(925);
		myArrayList.add(357);
		int x=myArrayList.size();
		int y=myArrayList.capacity();
		int firstValue=myArrayList.getFirst();
		int lastValue=myArrayList.getLast();
		System.out.println("\n==============MyArrayList<>============");
		System.out.println("value at first index of myArrayList : "+firstValue);
		System.out.println("value at last index of myArrayList : "+lastValue);
		System.out.println("\n==============================\n");
		System.out.println("Before removing myArrayList size : "+x);
		System.out.println("Before removing myArrayList capacity : "+y);
		
		Iterator<Integer> myArrayListIterator=myArrayList.iterator();
		System.out.println("Before : ");
		while(myArrayListIterator.hasNext()) {
			System.out.print(myArrayListIterator.next()+" ");
		}
		/*
		for(int i=0;i<myArrayList.size();i++) {
			System.out.print(myArrayList.get(i)+" ");
		}
		*/
		System.out.println("\n\n===========================\n");
		int removedElement=myArrayList.remove(0);
		System.out.println(removedElement+ " : is removed");
		System.out.println("After removing myArrayList size : "+myArrayList.size());
		System.out.println("After removing myArrayList capacity : "+myArrayList.capacity());
		
		Iterator<Integer> myArrayListIterator2=myArrayList.iterator();
		System.out.println("After : ");
		while(myArrayListIterator2.hasNext()) {
			System.out.print(myArrayListIterator2.next()+" ");
		}
		/*
		for(int i=0;i<myArrayList.size();i++) {
			System.out.print(myArrayList.get(i)+" ");
		}
		*/
		System.out.println("\n\n==============================\n");
		MyArrayList<String> myStringList=new MyArrayList<>();
		myStringList.add("Hero");
		myStringList.add("Zero");
		myStringList.add("My");
		myStringList.add("CAR");
		myStringList.add("HERE");
		System.out.println("Before removing element myStringList size : "+myStringList.size());
		System.out.println("Before removing element myStringList capacity : "+myStringList.capacity());
		Iterator<String> myArrayListIterator3=myStringList.iterator();
		System.out.println("Before : ");
		while(myArrayListIterator3.hasNext()) {
			System.out.print(myArrayListIterator3.next()+" ");
		}
		/*
		for(int i=0;i<myStringList.size();i++) {
			System.out.print(myStringList.get(i)+" ");
		}
		*/
		System.out.println(myStringList.remove("Car")?"\n\nElement removed":"\n\nElement not removed");
		System.out.println("After removing element myStringList size : "+myStringList.size());
		System.out.println("After removing element myStringList capacity : "+myStringList.capacity());
		Iterator<String> myArrayListIterator4=myStringList.iterator();
		System.out.println("After : ");
		while(myArrayListIterator4.hasNext()) {
			System.out.print(myArrayListIterator4.next()+" ");
		}
		/*
		for(int i=0;i<myStringList.size();i++) {
			System.out.print(myStringList.get(i)+" ");
		}
		*/
		System.out.println("\n\n=========================");
		
		MyArrayList<Double> listalpha=new MyArrayList<>(5);
		System.out.println("After using parametrized constructor with initial capacity :{ size }--> "+listalpha.size());
		System.out.println("After using parametrized constructor with initial capacity :{ capacity }--> "+listalpha.capacity());
	}

}
