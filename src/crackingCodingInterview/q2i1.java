package crackingCodingInterview;


public class q2i1<T> {

	Node<T> first;
	Node<T> last;
	
	public void add(T item){
		Node<T> newNode = new Node<T>(item);
		if(last!=null) last.next=newNode;
		last=newNode;
		if(first==null) first=newNode;
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
		Node<T> runner = this.first;
		while(current!=null){
			runner=current;
			while(runner.next!=null){
				if(current.item.equals(runner.next.item))
					runner.next=runner.next.next; //unlink
				else
				runner=runner.next; 
			}
			current = current.next;
		}
	}
	
	private static class Node<T>{
		T item;
		Node<T> next;
		
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

	}

}
