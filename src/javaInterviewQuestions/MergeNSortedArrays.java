package javaInterviewQuestions;

import java.util.PriorityQueue;

public class MergeNSortedArrays {
	
	public static int[] merge(int[][] arr){
		
		PriorityQueue<ArrayContainer> queue = new PriorityQueue<ArrayContainer>();
		
		int size = 0;
		//add arrays to heap
		for(int i=0; i<arr.length; i++) {
			queue.add(new ArrayContainer(arr[i], 0));
			size+=arr[i].length;
		}
		
		int[] result = new int[size];
		
		int j = 0;
		//while heap is not empty
		while(!queue.isEmpty()){
			ArrayContainer ac = queue.poll();
			result[j++]=ac.arr[ac.index];
			
			if(ac.index<ac.arr.length-1)
				queue.add(new ArrayContainer(ac.arr, ++ac.index));
		}
		
		return result;
	}
	
	public static void main(String[] args){
		//The time is O(nlog(n))
		//Arrays able to have any size
		int[] arr1 = {1,2,3,4, 24}; 
		int[] arr2 = {5,6,7,8};
		int[] arr3 = {9,10,11,12, 22}; 
		int[] arr = merge(new int[][]{arr1,arr2,arr3});
		System.out.println(java.util.Arrays.toString(arr));
		
	}

}

	class ArrayContainer implements Comparable<ArrayContainer> {
		
		int[] arr;
		int index;
		
		ArrayContainer(int[] arr, int index){
			this.arr=arr;
			this.index=index;
		}
		
		@Override
		public int compareTo(ArrayContainer ac){
			return this.arr[this.index]-ac.arr[ac.index];
		}

	}
