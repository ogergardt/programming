package crackingCodingInterview;

public class Q1i2 {
	//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other
	//p.90, p.193
	//The code is sensitive to spaces and case!!
	
	private static String sort(String str){
		char[] arr = str.toCharArray();
		java.util.Arrays.sort(arr);
		return new String(arr);
	}
	
	private static boolean permutation(String s1, String s2){
		if(s1.length()!=s2.length()) 
			return false;
		
		return sort(s1).equals(sort(s2));
	}
	
	private static boolean permutation2(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;

		int[] arr = new int[256];
		
		for(int i = 0; i<s1.length(); i++)
			arr[s1.charAt(i)]++;
		
		for(int i = 0; i<s2.length(); i++){
			arr[s2.charAt(i)]--;
			if(arr[s2.charAt(i)]<0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args){
		String s1 = "dog";
		String s2 = "god";
		if(permutation(s1, s2)) 
			System.out.format("String %s is permutation of string %s\n", s1, s2);
		else
			System.out.format("String %s is not permutation of string %s\n", s1, s2);
	}
}
