package implementingSet.set;

public interface MySet<E> extends Iterable<E> {
	public boolean add(E element);
	public boolean remove(E element);
	public boolean contains(Object value);
	public boolean isEmpty();
	public void clear();
	public int size();
}
