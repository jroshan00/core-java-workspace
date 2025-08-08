package implementingMap.map;

import java.util.Set;

/**
 * @author Roshan Pandey
 * @since 23/7/2025
 * 
 * Map is a interface which is used to store key-value pair.
 * 1) In Map key and Values are all in the form of object. 
 * 2) Every key must be unique and different, but values can be same.
 * 3) Key-value pair is called entry and it is referred as Map.Entry.
 * 
 */
public interface MyMap<K, V> {
	
	/*
	 * 
	 */
	public V put(K key, V value);
	
	public boolean remove(Object key,Object value);
	
	public void putAll(MyMap<K,V> map);
	
	/*
	 * It gives the value associated with the provided key.
	 * If there is no such key then it will give null.
	 * 
	 */
	public V get(Object key);

	public V getOrDefault(Object key, V defaultValue);

	public boolean containsKey(K key);
	
	public boolean isEmpty();

	public Set<K> keySet();

	public Set<MyEntry<K, V>> entrySet();

	public void clear();
	
	public int hashCode();
	
	public boolean equals(Object o);
	
	public String toString();
	
	public int size();

	public interface MyEntry<K, V> {
		public V getValue();

		public K getKey();

		public V setValue(V value);
		
		public int hashCode();
		public boolean equals(Object o);
		public String toString();
	}
}