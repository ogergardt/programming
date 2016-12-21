package javaInterviewQuestions;

import java.util.Arrays;

public class EqualityArrays {
	//How do you check the equality of two arrays in java? 
	
	public static void main(String[] args){
		System.out.println("Hi");
		int[] arr1 = new int[]{1,2,3};
		int[] arr2 = new int[]{3,1,2};
		int[] arr3 = new int[]{3,1,2,4};
		
		for(int i: arr1) System.out.print(i+" ");
		System.out.println();
		for(int i: arr2) System.out.print(i+" ");
		System.out.println();
		
		if(equal(arr1, arr2)) 
			System.out.println("arrays are equal");
		else
			System.out.println("arrays are not equal"); 
		
		for(int i: arr2) System.out.print(i+" ");
		System.out.println();
		for(int i: arr3) System.out.print(i+" ");
		System.out.println();
		
		if(equal(arr2, arr3)) 
			System.out.println("arrays are equal");
		else
			System.out.println("arrays are not equal"); 
		
		
	}
	
	private static boolean equal(int[] arr1, int[] arr2){
		if (arr1.length!=arr2.length) return false;
		int[] a1 = arr1.clone();
		int[] a2 = arr2.clone();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
	}
}
