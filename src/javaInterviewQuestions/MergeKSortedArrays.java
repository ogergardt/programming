package javaInterviewQuestions;

import java.util.PriorityQueue;
import java.util.Arrays;

public class MergeKSortedArrays {
	
	public static int[] merge(int[][] arr){
		
		//Use queue for ordered getting values from array
		PriorityQueue<ArrayContainer> queue = new PriorityQueue<ArrayContainer>(); 
		
		//lets count size of results array and offer first objecs for queue
		int  size =0;
		for(int[] a : arr) {
			size+=a.length;
			queue.add(new ArrayContainer(a, 0));
		}
		
		//create results array
		int[] result = new int[size];
		
		int i=0;
		while(!queue.isEmpty()){
			//getting minimal value of cursors from queue 
			ArrayContainer ac = queue.poll();
			result[i++]=ac.arr[ac.cursor];
			//move a head the cursor for container 
			if(ac.cursor<ac.arr.length-1)
				queue.add(new ArrayContainer(ac.arr, ac.cursor+1));	
		}
		
		return result;
	}
	
	public static void main(String[] args){
		//describe test data
		//arrays able to have any size
		int[] arr1 = {1,2,5,6,22};
		int[] arr2 = {3,4,7,8};
		int[] arr3 = {9,10,11,12,24,28};
		
		int[] arr = merge(new int[][]{arr1,arr2,arr3});
		System.out.println(Arrays.toString(arr));
	}
	

	
	static class ArrayContainer implements Comparable<ArrayContainer>{
		int[] arr;
		int cursor;
		
		ArrayContainer(int[] arr, int cursor){
			this.arr = arr;
			this.cursor = cursor;
		}
		
		public int compareTo(ArrayContainer ac){
			return this.arr[this.cursor] - ac.arr[ac.cursor];
		}
		
	}
}


