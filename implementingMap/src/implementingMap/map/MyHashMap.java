package implementingMap.map;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

final class MyHashMap<K, V> implements MyMap<K, V> {
	private MyEntry<K, V> entry;
	private Set<MyEntry<K, V>> entrySet=new HashSet<>();;
	private Set<K> keySet=new HashSet<>();
	private int size;
	
	@Override
	public int size() {
		if(size>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		return size;
	}

	@Override
	public V put(K key, V value) {
		if(entrySet.contains(key)) {
			for(MyEntry<K,V> entry: entrySet) {
					if(key.equals(entry.getKey())){
						entrySet.remove(entry);
						this.entry = new MyEntryImpl<>(key, value);
						keySet.add(key);
						entrySet.add(this.entry);
						size++;
						return value;
					}
			}
			return null;
		}else {
			entry = new MyEntryImpl<>(key, value);
			keySet.add(key);
			entrySet.add(entry);
			size++;
			return value;
		}
	}
	
	@Override
	public void putAll(MyMap<K,V> map) {
		this.entrySet.addAll(map.entrySet());
		this.keySet.addAll(map.keySet());
		this.size+=map.size();
	}

	@Override
	public V get(Object key) {
		if (keySet.contains(key) && key !=null) {
//			Iterator<MyEntry<K,V>> i=entrySet.iterator();
//			while(i.hasNext()) {
//				MyEntry<K,V> e=i.next();
//				if(key.equals(e.getKey())) {
//					return e.getValue();
//				}
//			}
			for (MyEntry<K, V> entry : entrySet) {
				if (key.equals(entry.getKey()))
					return entry.getValue();
			}
		}
		return null;
	}

	@Override
	public V getOrDefault(Object key, V defaultValue) {
		if (keySet.contains(key)) {
			for (MyEntry<K, V> entry : entrySet) {
				if ((entry.getKey()).equals(key))
					return entry.getValue();
			}
		}
		return defaultValue;
	}

	@Override
	public Set<K> keySet() {
		return keySet;
	}

	@Override
	public Set<MyEntry<K, V>> entrySet() {
		return entrySet;
	}

	@Override
	public void clear() {
		entrySet.clear();
		keySet.clear();
		size=0;
	}

	@Override
	public boolean containsKey(K key) {
		return keySet.contains(key);
	}
	
	@Override
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(entrySet, keySet, size);
	}
	
	@SuppressWarnings(value="unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyHashMap<K,V> other = (MyHashMap<K,V>) obj;
		return Objects.equals(entrySet, other.entrySet)
				&& Objects.equals(keySet, other.keySet) && size == other.size;
	}
	
	@Override
	public String toString() {
		return entrySet.toString();
	}

	@Override
	public boolean remove(Object key, Object value) {
		if(keySet.contains(key)) {
			keySet.remove(key);
			for(MyEntry<K,V> entry:entrySet) {
				if(key.equals(entry.getKey())) {
					entrySet.remove(entry);
					return true;
				}
			}
		}
		return false;
	}
}
