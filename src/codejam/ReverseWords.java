package codejam;

public class ReverseWords {
/*
Problem

Given a list of space separated words, reverse the order of the words. Each line of text contains L letters and W words. A line will only consist of letters and space characters. There will be exactly one space character between each pair of consecutive words.

Input

The first line of input gives the number of cases, N.
N test cases follow. For each test case there will a line of letters and space characters indicating a list of space separated words. Spaces will not appear at the start or end of a line.

Output

For each test case, output one line containing "Case #x: " followed by the list of words in reverse order.

Limits

Small dataset

N = 5
1 ≤ L ≤ 25

Large dataset

N = 100
1 ≤ L ≤ 1000

Sample


Input 

Output 
3
this is a test
foobar
all your base
Case #1: test a is this
Case #2: foobar
Case #3: base your all

 */
	
	public static void main(String[] args){
		String str = "this is a test";
		System.out.format("%s --> %s \n", str, new String(reverse(str.toCharArray())));
		str = "foobar";
		System.out.format("%s --> %s \n", str, new String(reverse(str.toCharArray())));
		str = "all your base";
		System.out.format("%s --> %s \n", str, new String(reverse(str.toCharArray())));
		
		str = "to be or not to be";
		System.out.format("%s --> %s \n", str, new String(reverse(str.toCharArray())));

	}
	
	private static char[] reverse(char[] arr){
		char[] newArr = new char[arr.length];
		int newLast=0;
		
		int last = arr.length-1;

		for(int i=arr.length-1; i>=0; i--){
			if(arr[i]==' ' || i==0){
				int start = (i==0) ? 0 : i+1;
				for(int j=start; j<=last; j++)
					newArr[newLast++] = arr[j];
					if(i!=0) newArr[newLast++] = ' ';
				last = i-1;	
			}
		}
		
		return newArr;
	}
}
