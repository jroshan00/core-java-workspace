package implementingList.programSeries;

import java.util.Objects;

public class Program3 {
	static class Node{
		Node next;
		int x;
		Node(int x){
			this.x=x;
		}
		@Override
		public String toString() {
			return "Node [x=" + x + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(x);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			return x == other.x;
		}
	}
	
	public static boolean hasCycle(Node head) {
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	public static Node reverseNode(Node head) {
		Node nextNode=null;
		Node prev=null;
		Node temp=head;
		while(temp!=null) {
			nextNode=temp.next;
			temp.next=prev;
			prev=temp;
			temp=nextNode;
		}
		head=prev;
		return head;
	}
	
	public Node dellMidNode(Node head) {
		Node fast=head;
		Node slow=head;
		Node prev=null;
		while(fast!=null && fast.next !=null) {
			prev=slow;
			fast=fast.next.next;
			slow=slow.next;
		}
		prev.next=slow.next;
		return prev;
	}
	
	public static void deleteDuplicateNode(Node head) {
		Node temp=head;
		while(head!=null && head.next !=null) {
			if(temp.x==temp.next.x) {
				temp.next=temp.next.next;
			}
		}
	}
	
	public static void main(String[] args) {
		Node head=new Node(10);
		Node node1=new Node(12);
		head.next=node1;
		Node node2=new Node(26);
		node1.next=node2;
		Node node3=new Node(44);
		node2.next=node3;
		//node3.next=node1;
		Node node4=new Node(44);
		node3.next=node4;
		node4.next=null;
		System.out.println("===========================");
		System.out.println(hasCycle(head));
		System.out.println("===========================");
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp);
			temp=temp.next;
		}
		
//		System.out.println("===========================");
//		reverseNode(head);
//		while(head!=null) {
//			System.out.println(head);
//			head=head.next;
//		}
		System.out.println("============================");
		System.out.println("head-> "+head);
		deleteDuplicateNode(head);
		Node temp1=head;
		while(temp1!=null) {
			System.out.println(temp1);
			temp1=temp1.next;
		}		
		
	}

}
