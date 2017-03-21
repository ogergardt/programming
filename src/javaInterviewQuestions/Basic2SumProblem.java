package javaInterviewQuestions;

import java.util.Map;
import java.util.HashMap;

public class Basic2SumProblem {
	
	//Basic 2 sum problem. Finding pair of numbers that add to   current sum.
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 4, 5, 5, 8, 6 };
		int sum = 10;

		Map<Integer, Integer> map = fillMap(arr);

		for (int i = 0; i < arr.length; i++) {
			int pair = sum - arr[i];
			if (map.containsKey(pair)) {
					System.out.format("[%d %d]\n", arr[i], pair);
					
					if(map.get(arr[i])==1){
						map.remove(arr[i]);
					} else {
						map.put(arr[i], map.get(arr[i])-1);
					}
					if(map.get(pair)==1){
						map.remove(pair);
					} else {
						map.put(pair, map.get(pair)-1);
					}
						
			}
		}

	}

	private static Map<Integer, Integer> fillMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}

}
