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
		//This solution work for any characters of ASCII table
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

	private static boolean isUnique2(String str){
		//This solution work if we limit characters with UPPERCASE or LOWERCASE 
		//because type int have size 32bit
		int checker = 0;
		
		for(int i=0; i<str.length();i++){
			int val = str.charAt(i)-'a';
			if((checker & (1 << val))>0) 
				return false;
			else
				checker |=(1<<val);
		}
		
		return true;
	}

	
}
