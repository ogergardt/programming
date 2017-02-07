package javaInterviewQuestions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLinkedLists {
	
	
	private static Node merge(Node[] headNodes){
	    if(headNodes==null||headNodes.length==0)
	        return null;
		
		PriorityQueue<Node> queue = new PriorityQueue<Node>(new Comparator<Node>(){
	        public int compare(Node l1, Node l2){
	            return l1.value - l2.value;
	        }
	    });
		
		//create results LinkedList
		Node resultHead = new Node(0);
		Node result = resultHead;
		
		//push to queue first object
		for(Node node : headNodes){
			queue.add(node);
		}
		
		while(!queue.isEmpty()){
			Node node = queue.poll();
			result.next=node;
			result=result.next;
			//add to queue next node
			if(node.next!=null) queue.add(node.next);
		}
	 
		return resultHead.next;
	}
	
	public static void main(String[] args){
		
		//Time: log(k) * n.
		//k is number of list and n is number of total elements.
		
		//preparing data for test
		Node l1Head = new Node(0);
		Node l1 = l1Head;
		for(int v : new int[]{1,2,3,4}){
			Node node = new Node(v);
			l1.next=node;
			l1=l1.next;
		}
		l1Head=l1Head.next;
		
		Node l2Head = new Node(0);
		Node l2 = l2Head;
		for(int v : new int[]{6,7,9,10}){
			Node node = new Node(v);
			l2.next=node;
			l2=l2.next;
		}
		l2Head=l2Head.next;

		Node l3Head = new Node(0);
		Node l3 = l3Head;
		for(int v : new int[]{5,8,11,12}){
			Node node = new Node(v);
			l3.next=node;
			l3=l3.next;
		}
		l3Head=l3Head.next;
		
		printList(l1Head);
		printList(l2Head);
		printList(l3Head);
		
		printList(merge(new Node[]{l1Head, l2Head, l3Head}));
			
	}
	
	private static void printList(Node node){
		while(node!=null) {
			System.out.format("%d ",node.value);
			node = node.next;
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
