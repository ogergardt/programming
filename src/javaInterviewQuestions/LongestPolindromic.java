package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

//https://habrahabr.ru/post/276195/
public class LongestPolindromic {

	public static void main(String[] args) {

		String str = "abaxabaxabb";

		Set<String> set = new HashSet<String>();
		SortedMap<Integer, ArrayList<String>> map = new TreeMap<Integer, ArrayList<String>>();

		combinations(str, set);

		int max = 1;
		for (String s : set) {
			if (isPolindrom(s)) {
				Integer key = (Integer) s.length();
				if(max<key) max=key;
				if (!map.containsKey(key)) {
					map.put(key, new ArrayList<String>());
				}
				map.get(key).add(s);
			}
		}
		System.out.println("max size is "+max+" : "+Arrays.toString(map.get(max).toArray()));
	}

	public static void combinations(String str, Set<String> set) {
		set.add(str);
		if (str.length() < 2)
			return;
		int length = str.length();
		combinations(str.substring(0, length-1), set);
		combinations(str.substring(1, length), set);

	}

	public static boolean isPolindrom(String str) {
		if (str.length() == 1 || (str.length() == 2 && str.charAt(0) == str.charAt(1)))
			return true;
		int begin = 0;
		int end = str.length() - 1;
		int middle = begin + (end - begin) / 2;
		int i;
		for (i = begin; i <= middle; i++) {
			if (str.charAt(begin) == str.charAt(end)) {
				begin++;
				end--;
			} else {
				break;
			}
		}
		if (i == middle + 1) {
			return true;
		}

		return false;
	}

}
