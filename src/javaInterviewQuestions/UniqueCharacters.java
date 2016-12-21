package javaInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
	
	public static void main(String[] args){
		System.out.println(isUnique2("abc"));
		System.out.println(isUnique2("abcb"));
	}
	
	
	static boolean isUnique(String str){
		Set<Character> set = new HashSet<Character>();
		for(char c : str.toCharArray()){
			if(!set.add(c)) return false;
		}
		return true;
	}

	static boolean isUnique2(String str){
		char[] arr = str.toCharArray();
		int i = 0;
		while(i<arr.length){
			int j=0;
			while(j<arr.length){
				if((i!=j)&&(arr[i]==arr[j])) return false;
				j++;
			}
			i++;
		}
		return true;
	}
}
