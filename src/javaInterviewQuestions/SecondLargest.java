package javaInterviewQuestions;

public class SecondLargest {
	//How to find second largest number in an integer array?
	public static void main(String[] args){
		System.out.println("Hi");
		
		System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));
		 
        System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));
 
        System.out.println(secondLargest(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));
 
        System.out.println(secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));
    
	}
	
	private static int secondLargest(int[] n){

		int first = 0;
		int second = 0;	
		if (n[0]>n[1]){
			first = n[0];
			second = n[1];	
		} 
		else{
			first = n[1];
			second = n[0];	
		}
		
		for(int i = 2; i<n.length; i++){
			if(n[i]>second){
				if(n[i]>first){
					second=first;
					first=n[i];
				}	
				else{
					second=n[i];
				}	
				
			}
		}
		
		return second;
	}
	

}
