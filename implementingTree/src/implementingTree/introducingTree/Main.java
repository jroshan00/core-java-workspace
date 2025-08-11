package implementingTree.introducingTree;

import implementingTree.introducingTree.Tree.Node;

public class Main {
	public static void main(String[] args) {
		Tree<String> tree=new Tree<>();
		//Root Node
		tree.root=new Node<>("A");
		
		//Parent Node
		tree.root.first_child=new Node<>("B");
		//Child Nodes
		tree.root.first_child.first_child=new Node<>("D");
		tree.root.first_child.second_child=new Node<>("E");
		tree.root.first_child.third_child=new Node<>("F");
		tree.root.first_child.fourth_child=new Node<>("G");
		tree.root.first_child.nth_child=new Node<>("H");
		
		//Parent Node
		tree.root.second_child=new Node<>("C");
		//Child Nodes
		tree.root.second_child.first_child=new Node<>("I");
		tree.root.second_child.second_child=new Node<>("J");
		tree.root.second_child.third_child=new Node<>("K");
		tree.root.second_child.fourth_child=new Node<>("L");
		tree.root.second_child.nth_child=new Node<>("M");
		
		tree.printTree(tree.root);
		
	}

}
