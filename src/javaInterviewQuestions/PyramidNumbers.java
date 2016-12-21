package javaInterviewQuestions;

public class PyramidNumbers {
	//2) How to create a pyramid of numbers in java? 
	public static void main(String[] args){
		//System.out.println("Hi");
		draw();
	}
	
	private static void draw(){
		for (int i=0; i<10; i++){
			for (int j=10-i; j>0; j--){
				System.out.print("  ");
			}
			System.out.print(i);
			for (int j=i-1; j>=0; j--){
				System.out.print(" "+j);
			}
			for (int j=1; j<=i; j++){
				System.out.print(" "+j);
			}
			System.out.println();
		}
		

	}

}
