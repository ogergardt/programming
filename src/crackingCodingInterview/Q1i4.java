package crackingCodingInterview;

public class Q1i4 {
	//Given a string, write a function to check if it is a permutation of a palindrome. 
	//A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. 
	//The palindrome does not need to be limited to just dictionary words. p.195, p.91

	//Make sure about sensitive to case, about spaces...
	
	//Todo  Implementation using bit operations 

	public static void main(String[] args){
		String str = "tactcoa";
		if(isPolindrome(str)) 
			System.out.format("%s is permutation of polindrome\n", str);
		else 
			System.out.format("%s is NOT permutation of polindrome\n", str);
		
	
	}
	
	
	private static boolean isPolindrome(String str){
		if(str.length()==1 ) return true;
		if(str.length()==2 && str.charAt(0)==str.charAt(1)) return true; 
		
		int[] arr = new int[256];
		
		for(int i=0; i<str.length(); i++)
			arr[str.charAt(i)]++;
		
		int uneven = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]%2>0) 
				uneven++;
			if(uneven>1) return false;
		}
		
		return true;
	}

	
}
