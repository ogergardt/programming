package javaInterviewQuestions;

public class LookForBug {
	//The following program increases/decreases the value of A and B until A 
	//is equal to X and B is equal to Y. Find the bug

	public static void MakeTheNumbersMatch(int a, int b, int x, int y) {
		//need to change && ==> ||
		//while (a != x && b != y) {
		while (a != x || b != y) {
			if (a > x) {
				a--;
			} else {
				a++;
			}
			if (b > y) {
				b--;
			} else {
				b++;
			}
		}
		System.out.format("a=%d b=%d", a,b);
	}

}
