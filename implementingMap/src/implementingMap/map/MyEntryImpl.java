package implementingMap.map;

import java.util.Objects;

public class MyEntryImpl<K, V> implements MyMap.MyEntry<K, V> {
	private K key;
	private V value;

	public MyEntryImpl(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public V getValue() {
		return this.value;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public V setValue(V value) {
		V oldValue = this.value;
		this.value = value;
		return oldValue;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(key, value);
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
		MyEntryImpl<K,V> other = (MyEntryImpl<K,V>) obj;
		return Objects.equals(key, other.key) && Objects.equals(value, other.value);
	}
	
	@Override
	public String toString() {
		return  key + " = " + value ;
	}
}
