package javaInterviewQuestions;

public class LinkedListMinMax<T> {
	
	
	//How to find the max/min element of linked list
	
	public static void main(String[] args){
		
		//creating a LinkedList
		Node head = new Node(0);
		Node temp = head;
		for (int v : new int[]{5,1,3,2,-6,23,7}){
			Node node = new Node(v);
			temp.next=node;
			temp=node;
		}
		head=head.next;
		
		//check the making of LinkedList
		printList(head);
		System.out.format("min= %d max= %d", getMin(head).value, getMax(head).value);

	}
	
	public static Node getMin(Node node){
		Node min = node;
		Node tmp = node.next;
		while(tmp!=null){
			if(tmp.value<min.value)
				min=tmp;
			tmp = tmp.next;
		}
		return min;
	}
	
	public static Node getMax(Node node){
		Node max = node;
		Node tmp = node.next;
		while(tmp!=null){
			if(tmp.value>max.value)
				max=tmp;
			tmp = tmp.next;
		}
		return max;
	}
	
	
	private static void printList(Node node){
		while(node!=null){
			System.out.format("%d ", node.value);
			node=node.next;
		}
		System.out.println();
	}
	
	static class Node {
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	
	
		

}
	

	
	
	

