package implementingList.arrayList.list;

//import java.util.List;
public interface MyList<E> {
	/**
	 * @author Roshan Pandey
	 * @since 20/07/2025
	 * 
	 * E represents element here.
	 * 
	 */
	public boolean add(E e);
	public void add(int index, E e);
	public boolean remove(Object o);
	public E get(int index);
	public int size();
	public boolean isEmpty();
	public void clear();
}
