package javaInterviewQuestions;

public class LinkedListReverse {

	// Reverse a linked list and return pointer to the head
	// The input list will have at least one element

	// Node is defined as
	static class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args){
		Node node1 = new Node();
		node1.data = 1;
		Node node2 = new Node();
		node2.data = 2;
		Node node3 = new Node();
		node3.data = 3;
		node1.next=node2;
		node2.next=node3;
		
		//print(node1);
		print(reverse(node1));
	
	}
	
	static Node reverse(Node curr){
		Node next = null;
		Node prev = null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	
	static void print(Node current){
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}

}
