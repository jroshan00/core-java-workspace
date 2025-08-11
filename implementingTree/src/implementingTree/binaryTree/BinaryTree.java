package implementingTree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T> {
	Node<T> root;

	public static class Node<T> {
		private T data;
		Node<T> left_child;
		Node<T> right_child;

		Node(T data) {
			this.data = data;
		}
	}

	public void printParentChild(Node<T> node) {
		if (node == null)
			return;
		if (node.left_child != null || node.right_child != null)
			System.out.println("Parent Node-->" + node.data);
		else
			System.out.println("Leaf Node-->" + node.data);
		if (node.left_child != null)
			System.out.println("    left_child-->" + node.left_child.data);
		if (node.right_child != null)
			System.out.println("    right_child-->" + node.right_child.data);
		printParentChild(node.left_child);
		printParentChild(node.right_child);
	}

	public void preOrderTraversal(Node<T> node, List<T> out) {
		if (node == null)
			return;
		out.add(node.data);
		preOrderTraversal(node.left_child, out);
		preOrderTraversal(node.right_child, out);
	}

	public void postOrderTraversal(Node<T> node, List<T> out) {
		if (node == null)
			return;
		postOrderTraversal(node.left_child, out);
		postOrderTraversal(node.right_child, out);
		out.add(node.data);
	}

	public void inOrderTraversal(Node<T> node, List<T> out) {
		if (node == null)
			return;
		inOrderTraversal(node.left_child, out);
		out.add(node.data);
		inOrderTraversal(node.right_child, out);
	}
	
	public List<T> levelOrderTraversal(Node<T> node){
		if(node==null) return null;
		List<T> res=new ArrayList<>();
		Queue<Node<T>> q=new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			Node<T> current=q.poll();
			res.add(current.data);
			if(current.left_child!=null) q.add(current.left_child);
			if(current.right_child!=null) q.add(current.right_child);
		}
		return res;
	}

}
