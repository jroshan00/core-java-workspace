package implementingTree.introducingTree;

public class Tree<E> {
	public Node<E> root;

	public Tree() {
	}

	static class Node<E> {
		private E e;
		Node<E> first_child;
		Node<E> second_child;
		Node<E> third_child;
		Node<E> fourth_child;
		Node<E> nth_child;

		Node(E e) {
			this.e = e;
		}
	}

	public void printTree(Node<E> node) {
		if (node == null) {
			return;
		}

		// Print this node and its children
		if (node.first_child != null 
				|| node.second_child != null 
				|| node.third_child != null
				|| node.fourth_child != null 
				|| node.nth_child != null) {
			System.out.println("Parent Node -> " + node.e);
		} else {
			System.out.println("Leaf Node -> " + node.e);
		}
		if (node.first_child != null) {
			System.out.println("   first_child --> " + node.first_child.e);
		}
		if (node.second_child != null) {
			System.out.println("   second_child --> " + node.second_child.e);
		}
		if (node.third_child != null) {
			System.out.println("   third_child --> " + node.third_child.e);
		}
		if (node.fourth_child != null) {
			System.out.println("   fourth_child --> " + node.fourth_child.e);
		}
		if (node.nth_child != null) {
			System.out.println("   nth_child --> " + node.nth_child.e);
		}

		printTree(node.first_child);
		printTree(node.second_child);
		printTree(node.third_child);
		printTree(node.fourth_child);
		printTree(node.nth_child);
	}
}
