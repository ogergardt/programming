package javaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	//Anagram program in java 
	public static void main(String[] args){
		System.out.println("Hi");
		if(isAnagram("Mother In Law", "Hitler Woman"))
			System.out.println("are anagram"); 
		else 
			System.out.println("are not anagram");
		
/*	    isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("keEp", "peeK");
        isAnagram("SiLeNt CAT", "LisTen AcT");
        isAnagram("Debit Card", "Bad Credit");
        isAnagram("School MASTER", "The ClassROOM");
        isAnagram("DORMITORY", "Dirty Room");
        isAnagram("ASTRONOMERS", "NO MORE STARS");
        isAnagram("Toss", "Shot");
        isAnagram("joy", "enjoy");*/
	}
	
/*	private static boolean isAnagram(String str1, String str2){
		str1 = str1.replaceAll("\\s+","");
		str2 = str2.replaceAll("\\s+","");
		if(str1.length()!=str2.length()) return false;
		
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();	
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
			
		return Arrays.equals(arr1, arr2);
	}*/
	
	private static boolean isAnagram(String str1, String str2){
		str1 = str1.replaceAll("\\s+","").toLowerCase();
		str2 = str2.replaceAll("\\s+","").toLowerCase();
		if(str1.length()!=str2.length()) return false;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str1.length(); i++){
			char c = str1.charAt(i);
			int cnt=0;
			if(map.containsKey(c)) cnt = map.get(c);

			map.put(c, ++cnt);
		}
		
		for(int i=0; i<str2.length(); i++){
			char c = str1.charAt(i);
			int cnt=0;
			if(!map.containsKey(c)) return false;
			if(map.get(c)==0) return false;
			map.put(c, --cnt);
		}
		return true;
	}

	
}
