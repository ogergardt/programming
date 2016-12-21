package javaInterviewQuestions;

public class SumDigitsOfNumber {
	//9) How to find sum of all digits of a number in java? 
	public static void main(String[] args){
		System.out.println("Hi");
		System.out.format("sum of all digits of a number %d is %d", 150, sumDigits(150));
	}
	
	private static int sumDigits(int n){
		int sum = 0;
		int temp =n;
		while(temp!=0){
			sum = sum + temp%10;
			temp=temp/10;
		}
		
		return sum;
	}

}
