package implementingList.arrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;



public final class  MyArrayList<E> implements Iterable<E> {
	/**
	 * @author Roshan Pandey
	 * @since 7/10/2025
	 */
	private int capacity;
	private int size;
	private Object[] array;

	public MyArrayList() {
		capacity = 10;
		size = 0;
		array = new Object[capacity];
	}
	
	public MyArrayList(int initial_capacity) {
		if(initial_capacity>0) {
			array = new Object[this.capacity=initial_capacity];
		}else if(initial_capacity==0) {
			array= new Object[]{};
		}
		
	}
	
	public int size() {
		return size;
	}
	public int capacity() {
		return capacity;
	}
	public boolean add(E data) {
		if (capacity == size) {
			capacity = 2 * capacity;
			Object[] newArray = new Object[capacity];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			return true;
		} else {
			array[size++] = data;
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	public  E get(int index) {
		if (size < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		} else {
			return (E)array[index];
		}
	}
	
	@SuppressWarnings("unchecked")
	public  E getFirst(){
		if(size==0) {
			throw new NoSuchElementException();
		}else {
			return (E)array[0];
		}
	}
	
	@SuppressWarnings("unchecked")
	public  E getLast(){
		if(size==0) {
			throw new NoSuchElementException();
		}else {
			return (E)array[size-1];
		}
	}
	
	@SuppressWarnings("unchecked")
	public E remove(int index){
		Object o=array[index];
		if(size<0 || index >=size ) {
			throw new IndexOutOfBoundsException();
		}else {
			for(int i=index;i<array.length-1;i++) {
				array[i]=array[i+1];
			}
			size--;
			return (E)o;
		}
	}
	
	public boolean remove(Object o) {
		int index;
		for(index=0;index<size;index++) {
			if(array[index].equals(o))	break;
		}
		if(index==size) {
			return false;
		}else {
			remove(index);
			return true;
		}
		
	}
	/**
	 * {@link #iterator()} is a abstract method from {@code Iterable} interface which needs to be overriden in order 
	 * to get the personized {@code Iterator} instance while calling {@link #iterator()} 
	 * which returns the instance of {@link MyArrayListIterator} 
	 * 
	 */
	@Override
	public Iterator<E> iterator() {
		return  new MyArrayListIterator();
	}
	
	/**
	 * Now We need to have a class that implements {@code Iterator} interface which will inherit
	 * the properties on {@code Iterator} interface having {@link #hasNext()} and {@link #next()}
	 * So, inner class can be a good option here for the purpose.
	 * 
	 * and finally we can return the Instance of {@link MyArrayListIterator } which will
	 * also be having properties of {@code Iterator}
	 * 
	 */
	
	private class MyArrayListIterator implements Iterator<E>{
		private int index=0;
		@Override
		public boolean hasNext() {
			return index<size ;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			if(size==0) throw new NullPointerException();
			return (E)array[index++];
		}
		
		
		
	}
}
