package javaInterviewQuestions;

public class DuplicateCharacters {
	//4) How to find duplicate characters in a string in java? 
	public static void main(String[] args){
		System.out.println("Hi");
		
		String str = "to beee or not  to be";
		char prev = 0;
		int cnt = 0;
		
		for(char c: str.toCharArray() ){
			if (c==prev) 
				cnt++;
			else {
				if (cnt>1) System.out.format("%c - %d\n", prev, cnt);
				prev=c;
				cnt=1;
			}
		}
	}	
		
}
