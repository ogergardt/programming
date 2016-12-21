package javaInterviewQuestions;

public class RemoveWhiteSpaces {
//3) How do you remove all white spaces from a string in java? 
	public static void main(String[] args){
		System.out.println("Hi");

		String str = "to\t be or not to\n be";
		System.out.format("%s ==> %s", str, str.replaceAll("\\s+", ""));
		
	}
}
