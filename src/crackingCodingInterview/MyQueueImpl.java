package crackingCodingInterview;

public class MyQueueImpl<T> {
	//Implementation of Queue p.97
	
	private class QueueNode<T> {
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data){
			this.data = data;
		}
	}	
		private QueueNode<T> first;
		private QueueNode<T> last;

		public void add(T data){
			QueueNode<T> t = new QueueNode<T>(data);
			if(last!=null) last.next = t;
			last=t;
			if(first==null) first=t;
		}
		
		public T peek() throws Exception {
			if(first==null) throw new Exception("Queue is Empty");
			T data = first.data;
			return data;
		}
		
		public T remove() throws Exception {
			if(first==null) throw new Exception("Queue is Empty");
			T data = first.data;
			first = first.next;
			return data;
		}
		
		public boolean isEmpty(){
			return first==null;
		}

		public static void main(String[] args) throws Exception {
			MyQueueImpl<Integer> queue = new MyQueueImpl<Integer>();
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			System.out.println(queue.remove());//1
			System.out.println(queue.remove());//2
			System.out.println(queue.remove());//3
			System.out.println(queue.peek());//4
			System.out.println(queue.remove());//4
			
			
			
		}
}
