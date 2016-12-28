package crackingCodingInterview;

import java.lang.reflect.Array;

public class Q3i1 {
	
	//Describe how you could use a single array to implement three stacks
	private static class FixedMultiStack<T>{
		private int capacity;
		private T[] values;
		private int[] cursors; 
		public FixedMultiStack(Class<T> clazz, int numberOfStacks, int capacity){
			this.capacity=capacity;
			this.values = (T[]) Array.newInstance(clazz, numberOfStacks*capacity);
			this.cursors = new int[numberOfStacks]; //default 0
		}
		
		
		private int indexOfTop(int stackNum){ 
			//stackNum start from 0
			int offset = stackNum*capacity;
			int cursor = cursors[stackNum];
			return offset+cursor-1;
		}
		
		public void push(int stackNum, T data) throws Exception {
			if (cursors[stackNum]<=capacity){
				cursors[stackNum]++;
				values[indexOfTop(stackNum)] = data;
			} else throw new Exception("Stack #"+stackNum+" is full");
		}
		
		public T peek(int stackNum) throws Exception {
			if(cursors[stackNum]==0) throw new Exception("Stack #"+stackNum+" is full");
			return values[indexOfTop(stackNum)];
		}
		
		public T pop(int stackNum) throws Exception {
			if(cursors[stackNum]==0) throw new Exception("Stack #"+stackNum+" is full");
			T res = values[indexOfTop(stackNum)];
			//Clean
			values[indexOfTop(stackNum)]=null;
			cursors[stackNum]--;
			return res;
		}
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		//Testing 
		int num = 3; //Number of Stacks
		int capacity = 4; //size of each stack
		FixedMultiStack<Integer> stack = new FixedMultiStack<Integer>(Integer.class, num, capacity);
		System.out.println("size of array is "+stack.values.length);
		for(int i = 0; i<num; i++){
			stack.push(i, 1);
			stack.push(i, 2);
			stack.push(i, 3);
			stack.push(i, 4);
		}
		System.out.println("=================");
		for(int i = 0; i<num; i++){
			System.out.println("Pop from stack #"+i+" return a value: "+stack.pop(i));
			System.out.println("Pop from stack #"+i+" return a value: "+stack.pop(i));
			System.out.println("Pop from stack #"+i+" return a value: "+stack.pop(i));
			System.out.println(" Peek from stack #"+i+" return a value: "+stack.peek(i));
			System.out.println(" Peek from stack #"+i+" return a value: "+stack.peek(i));
			System.out.println(" Peek from stack #"+i+" return a value: "+stack.peek(i));
			System.out.println("Pop from stack #"+i+" return a value: "+stack.pop(i));
		}
	}
	

}
