package crackingCodingInterview;

//Implemetation a simple stack p.96
public class StackNode<T> {
	T data;
	StackNode<T> top;
	StackNode<T> next;
	
	public StackNode(){}
	
	public StackNode(T data){
		this.data = data;
	}
	
	public void push(T data){
		StackNode<T> t = new StackNode<T>(data);	
		t.next = this.top;
		this.top = t;
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
		return this.top==null;
	}
	
	public static void main(String[] args) throws Exception {
		StackNode<Integer> stack = new StackNode<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());//4
		System.out.println(stack.pop());//3
		System.out.println(stack.pop());//2
		System.out.println(stack.peek());//1
		System.out.println(stack.pop());//1
	}
}
