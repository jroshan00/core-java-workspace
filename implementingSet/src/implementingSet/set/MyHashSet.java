package implementingSet.set;

//import java.util.Arrays;
import java.util.Iterator;
//import java.util.Set;
//import java.util.Objects;

public class MyHashSet<E> implements MySet<E>{

	protected static class Node<E> {
		private E key;
		private Node<E> next;

		private Node(E key) {
			this.key = key;
		}
		
		@Override
		public String toString() {
			return key+"";
		}
	}

	private static final int DEFAULT_CAPACITY = 16;
	private static final float LOAD_FACTOR = 0.75f;
	private Node<E>[] buckets;
	private int size;

	@SuppressWarnings(value = "unchecked")
	public MyHashSet() {
		buckets = (Node<E>[]) new Node[DEFAULT_CAPACITY];
		size = 0;
	}

	private int hash(Object key) {
		return (key == null) ? 0 : Math.abs(key.hashCode() % buckets.length);
	}

	@Override
	public boolean add(E key) {
		int index = hash(key);
		Node<E> current = buckets[index];
		while (current != null) {
			if (key != null && key.equals(current.key) || key == null && current.key == null) {
				return false;
			}
			current = current.next;
		}

		Node<E> newNode = new Node<>(key);
		newNode.next = buckets[index];
		buckets[index] = newNode;
		size++;

		if ((float) size / buckets.length > LOAD_FACTOR) {
			resize();
		}
		return true;
	}

	private void resize() {
		this.size = size * 2;
	}

	@Override
	public boolean remove(E element) {
		return false;
	}

	@Override
	public boolean contains(Object key) {
		int index=hash(key);
		Node<E> current=buckets[index];
		while(current!=null) {
			if(key!=null && key.equals(current.key) || key==null && current.key==null) {
				return true;
			}
			current=current.next;
		}
		return false;
		
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public void clear() {
		buckets = null;
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		Iterator<E> it=iterator();
		
		if(!it.hasNext()) {
			return "[]";
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(; ;) {
			E e=it.next();
			sb.append(e);
			if(!it.hasNext()) {
				return sb.append("]").toString();
			}
			sb.append(",").append(" ");
		}
	}
	
	
	@Override
	public Iterator<E> iterator(){
		return new MyHashSetIterator();
	}
	

	private class MyHashSetIterator implements Iterator<E> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < size;
		}

		@SuppressWarnings(value = "unchecked")
		@Override
		public E next() {
			return (E) buckets[index++];
		}

	}

}
