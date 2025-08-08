package implementingList.linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;
//import java.util.List;

public final class MySinglyLinkedList<E> implements Iterable<E> {
	private Node<E> head;
	private int size = 0;

	private static class Node<E> {
		E data;
		Node<E> next;

		Node(E data) {
			this.data = data;
			this.next = null;
		}
	}

	public E get(int index) {
		Node<E> current = head;
		if (size < 0 || index >= size || index < 0) {
			throw new IllegalArgumentException();
		} else {
			int x = index;
			while (x > 0) {
				current = current.next;
				x--;
			}
		}
		return current.data;
	}

	public E getFirst() {
		if (head == null) {
			return null;
		} else {
			final Node<E> current = head;
			return (E) current.data;
		}
	}

	public E getLast() {
		if (head == null)
			throw new NoSuchElementException();
		else {
			Node<E> current = head;
			while (current.next != null) {
				current = current.next;
			}
			return (E) current.data;
		}
	}

	public void add(int index, E value) {
		if (size == 0 || index >= size || index < 0) {
			throw new IllegalArgumentException();
		} else {
			Node<E> newNode = new Node<>(value);
			if (index == 0) {
				newNode.next = head;
				head = newNode;
				size++;
			} else {
				Node<E> current = head;
				Node<E> prev = head;
				int i = index;
				int j = index - 1;
				while (i > 0) {
					current = current.next;
					i--;
				}
				while (j > 0) {
					prev = prev.next;
					j--;
				}
				newNode.next = current;
				prev.next = newNode;
				size++;
			}

		}
	}

	public void add(E value) {
		Node<E> newNode = new Node<>(value);
		if (head == null) {
			head = newNode;
			size++;
		} else {
			Node<E> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			size++;
		}
	}

	public void addFirst(E value) {
		Node<E> newNode = new Node<>(value);
		if (head == null) {
			head = newNode;
			size++;
		} else {
			Node<E> current = head;
			head = newNode;
			head.next = current;
			size++;
		}
	}

	public void addLast(E value) {
		Node<E> newNode = new Node<>(value);
		if (head == null) {
			head = newNode;
			size++;
		} else {
			Node<E> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			size++;
		}
	}

	public E removeFirst() {
		if (head == null)
			throw new NoSuchElementException();
		else {
			final Node<E> first = head;
			head = head.next;
			size--;
			return (E) first.data;
		}
	}

	public E removeLast() {
		final Node<E> last;
		if (head == null)
			throw new NoSuchElementException();
		else if (head.next == null) {
			last = head;
			head = null;
			return last.data;
		} else {
			Node<E> current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			last = current.next;
			current.next = null;
			size--;
			return last.data;

		}
	}

	public int size() {
		return size;
	}

	private class MySinglyLinkedListIterator implements Iterator<E> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < size;
		}

		@Override
		public E next() {
			return get(index++);
		}

	}

	@Override
	public Iterator<E> iterator() {

		return new MySinglyLinkedListIterator();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node<E> temp = head;
		while (temp != null) {
			sb.append(temp.data);
			if (temp.next == null) {
				return sb.append("]").toString();
			}
			sb.append(",").append(" ");
			temp = temp.next;
		}
		return "[]";
	}

}
