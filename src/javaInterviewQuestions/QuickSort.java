package javaInterviewQuestions;

public class QuickSort {
	
	public static void main(String[] args){
		System.out.println("Hi");
		int[] arr = new int[10];
		for(int i =0; i<arr.length; i++){
			arr[i] = (int) (Math.random()*100); 
		}
		printArray(arr);
		
		sort(arr, 0, arr.length-1);
		printArray(arr);
		
	}
	private static void printArray(int[] arr){
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i]+"\t"); 
		}
		System.out.println(); 
		
	}
	
	private static int[] sort(int[] arr, int start, int end){
		if(start>=end) return arr;
		
		int i = start;
		int j = end;
		int op = i+(j-i)/2;
		while(i<j){ 
			while(arr[i]<arr[op] && i<=op) i++;
			while(arr[j]>arr[op] && j>=op) j--;		
			if(i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;		
			}
		}
		sort(arr,start,op);
		sort(arr,op+1,end);
		
		return arr;
	}

}
