package javaInterviewQuestions;

public class ActionsWithArray {
	public static void main(String[] args){
		System.out.println("Hi");
		
		int[][] arr1 = {
				{1,2,0,0},
				{0,1,1,0}	
				};
		int[][] arr2 = {
				{1,1},
				{2,1},
				{1,2},
				{1,2}
				};
//a11 = 1*1+2*2+0*1+0*1 = 5	a12 = 1*1+2*1+0*2+0*2 = 3
//a21 = 0*1+1*2+1*1+0*1 = 3	a22= = 0*1+1*1+1*2+0*2 = 3
 
		
		print(arr1);
		System.out.println();
		print(arr2);
		System.out.println();
		System.out.format("size result array is %d %d\n", arr1.length, arr2[0].length);

		print(multiplication(arr1,arr2));
		
	}
	private static void print(int[][] arr){
		int rows = arr.length;
		int columns = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}	
		
	}
	
	private static int[][] multiplication(int[][] arr1, int[][] arr2){
		
		int rows = arr1.length;
		int columns = arr2[0].length;
		int arr[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				for (int k = 0; k < arr1[0].length; k++) {
					arr[i][j] += arr1[i][k]*arr2[k][j];	
				}
			}
		}

		return arr;
	}

}
