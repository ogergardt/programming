package javaInterviewQuestions;

public class ReverseString {
	//1) How to reverse a string in java? 
	public static void main(String[] args){
		System.out.println("Hi");
		String str = "to be or not to be";	
		System.out.println("length="+str.length());
		
		System.out.format("recursive: %s ==> %s", str, reverse(str));
		
	}
	
	private static String reverse(String str){
		if (str.length()>0) 
			return str.substring(str.length()-1)+reverse(str.substring(0,str.length()-1));
		
		return "";
	}

}

	


