package crackingCodingInterview;


public class q2i1<T> {
	
	Node<T> first;
	Node<T> last;
	
	public void add(T item){
		Node<T> newNode = new Node<T>(item);
		newNode.prev= last;
		if(last!=null) last.next=newNode;
		last=newNode;
		if(first==null) first=newNode;
	}

	
	
	public void unlink(Node<T> node){
		if(node.prev!=null)
		node.prev.next = node.next;
		if(node.next!=null)
		node.next.prev=node.prev;
		
	}
	
	public void printList(){
		Node<T> current = this.first;
		while(current!=null){
			System.out.println(current.item);
			current = current.next;
		}
	}
	
	public void deleteDups(){
		Node<T> current = this.first;
		while(current!=null){
			Node<T> runner = this.first;
			while(runner!=null){
				if((current!=runner) && (current.item.equals(runner.item)))	unlink(runner);
				runner=runner.next;
			}
			current = current.next;
		}
	}
	
	private static class Node<T>{
		T item;
		Node<T> next;
		Node<T> prev;
		
		Node(T item){
			this.item=item;
		}
	}
	
	public static void main(String[] args){
		
		String str = "abca";
		
		q2i1<Character> list = new q2i1<Character>();
		
		//Fill out the list
		for(int i = 0; i<str.length(); i++){
			list.add(new Character(str.charAt(i)));
		}
		
		list.printList();
		
		list.deleteDups();
		
		System.out.println("+++++++++");
		list.printList();

	}
	
	

}
