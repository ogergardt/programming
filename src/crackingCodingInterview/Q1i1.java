package crackingCodingInterview;

public class Q1i1 {
	//Is Unique: Implement an algorithm to determine if a string has all unique characters. 
	//What if you cannot use additional data structures? p.90, p.192
	
	public static void main(String[] args){
		String str = "abccc";
		if(isUnique(str)) 
			System.out.println("String contains unique characters");
		else
			System.out.println("String contains repeats");
	}
	
	private static boolean isUnique(String str){
		
		if(str.length()>256) return false;
		
		boolean[] arr =new boolean[256];
		
		for(int i=0; i<str.length();i++){
			int pos = str.charAt(i);
			if(arr[pos]) 
				return false;
			else
				arr[pos]=true;
		}
		
		return true;
	}

}
