package javaInterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateInArray {
	// How to find duplicate elements in an array?
	public static void main(String[] args) {
		System.out.println("Hi");
		int[] arr = new int[] { 1, 2, 3, 3, 3, 4, 5, 6, 3 };

		Map<Integer, Integer> map = getDublicated(arr);
		if (map.size() > 0) {
			System.out.println("array have dublicates:");
			for (int key : map.keySet()) {
				System.out.format("%d ==> %d times\n", key, map.get(key));
			}
		}

	}

	private static Map<Integer, Integer> getDublicated(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : arr) {
			int cnt = 0;
			if (map.containsKey(i)) {
				cnt = map.get(i);
			}
			map.put(i, ++cnt);
		}

		Iterator<Map.Entry<Integer, Integer>> i = map.entrySet().iterator();
		
		while(i.hasNext()) {
			Map.Entry<Integer, Integer> entry = i.next();
			if(entry.getValue()==1) i.remove(); 
		}	
		return map;
	}

}
