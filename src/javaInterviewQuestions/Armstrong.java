package javaInterviewQuestions;

public class Armstrong {
	//Armstrong number program in java
	//371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371
	
	public static void main(String[] args){
		System.out.println("Hi");
		isArmstrong(371);
		isArmstrong(126);
	}
	
	private static boolean isArmstrong(int n){
		
		int digits = 0; 
		int sum = 0;
		
		int temp = n;
		while(temp!=0){
			digits++;
			temp=temp/10;
		}

		
		temp = n;
		while(temp!=0){
			int remainder = temp%10;
			sum =  sum+ (int) Math.pow(remainder,digits);
			temp=temp/10;
		}
		
		if(n==sum)
			System.out.println(n+" is armstrong number");
		else
			System.out.println(n+" is not armstrong number");

		
		return n==sum;
	}

}
