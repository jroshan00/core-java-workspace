package implementingTree.binaryTree;

import java.util.ArrayList;
import java.util.List;

import implementingTree.binaryTree.BinaryTree.Node;
public class Main {
	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree=new BinaryTree<>();
		binaryTree.root=new Node<>(12);
		binaryTree.root.left_child=new Node<>(13);
		binaryTree.root.left_child.left_child=new Node<>(15);
		binaryTree.root.left_child.right_child=new Node<>(16);
		
		binaryTree.root.right_child=new Node<>(14);
		binaryTree.root.right_child.left_child=new Node<>(17);
		binaryTree.root.right_child.right_child=new Node<>(18);
		
		binaryTree.printParentChild(binaryTree.root);
		System.out.println("\n");
		System.out.println("==========PRE ORDER TRAVERSAL==============");
		List<Integer> preOrderTraversalList= new ArrayList<>();
		binaryTree.preOrderTraversal(binaryTree.root,preOrderTraversalList);
		System.out.println(preOrderTraversalList);
		System.out.println("\n");
		System.out.println("==========POST ORDER TRAVERSAL==============");
		List<Integer> postOrderTraversalList= new ArrayList<>();
		binaryTree.postOrderTraversal(binaryTree.root,postOrderTraversalList);
		System.out.println(postOrderTraversalList);
		System.out.println("\n");
		System.out.println("===========IN ORDER TRAVERSAL=============");
		List<Integer> inOrderTraversalList= new ArrayList<>();
		binaryTree.inOrderTraversal(binaryTree.root,inOrderTraversalList);
		System.out.println(inOrderTraversalList);
		System.out.println("\n");
		System.out.println("===========LEVEL ORDER TRAVERSAL=============");
		List<Integer> levelOrderTraversalList= binaryTree.levelOrderTraversal(binaryTree.root);
		System.out.println(levelOrderTraversalList);
	}

}
