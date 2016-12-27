package crackingCodingInterview;

public class MyStackImpl<T> {
	//Implemetation a simple stack p.96
	
	private class StackNode<T>{
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data){
			this.data = data;
		}
	}
	
	private StackNode<T> top;
	
	public void push(T data){
		StackNode<T> t = new StackNode<T>(data);
		t.next = this.top;
		this.top=t;
	}
	
	public T pop() throws Exception {
		if(this.top==null) throw new Exception("Stack is Empty");
		T data = this.top.data;
		this.top = this.top.next;
		return data;
	}
	
	public T peek() throws Exception {
		if(this.top==null) throw new Exception("Stack is Empty");
		return this.top.data;
	}
	
	public boolean isEmpty(){
		return top==null;
	}
	
	public static void main(String[] args) throws Exception {
		MyStackImpl<Integer> stack = new MyStackImpl<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop()); //4
		System.out.println(stack.pop()); //3
		System.out.println(stack.pop()); //2
		System.out.println(stack.peek()); //1
		System.out.println(stack.pop()); //1
	}
}
