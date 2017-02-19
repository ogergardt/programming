package javaInterviewQuestions;

public class LinkedListReverse {

	// Reverse a linked list and return pointer to the head
	// The input list will have at least one element

	// Node is defined as
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);

		//print(node);
		print(reverse(node));

	}

	static Node reverse(Node node) {
		Node prev = null;
		while (node != null) {
			Node next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}
		return prev;
	}

	static void print(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
