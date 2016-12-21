package javaInterviewQuestions;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args){
		System.out.println("BinarySearch implementation");
		int[] arr = {1 ,2, 3, 4};
		Arrays.sort(arr);
		int pos = indexOf(arr, 3);
		System.out.println("result: "+pos);
		
	}
	
	private static int indexOf(int[] arr, int key){
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if      (key < arr[mid]) hi = mid - 1;
            else if (key > arr[mid]) lo = mid + 1;
            else return mid;
        }
		return -1;
	}

}
