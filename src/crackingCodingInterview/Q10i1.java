package crackingCodingInterview;

public class Q10i1 {
	//You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B. Write a method to merge B to A in sorted order. 
	//p.149
	
	public static void mergeArrays(int[] a, int[] b, int lastA, int lastB){
		int indexA = lastA; //index of last element of array A
		int indexB = lastB; //index of last element of array B
		int indexMerged=lastA+lastB+1;
		while(indexB>=0) {
			if(indexA>=0 && a[indexA]>b[indexB]){
				//System.out.format("indexMerged=%d, indexA=%d, indexB=%d, a[indexA]=%d, b[indexB]=%d\n", indexMerged, indexA, indexB, a[indexA], b[indexB]);
				a[indexMerged]=a[indexA];
				indexA--;
			} else {
				//System.out.format("\tindexMerged=%d, indexA=%d, indexB=%d, a[indexA]=%d, b[indexB]=%d\n", indexMerged, indexA, indexB, a[indexA], b[indexB]);
				a[indexMerged]=b[indexB];
				indexB--;
			}		
		indexMerged--;
		}
	}
		public static void main(String[] args){
			int[] b = {1,2,3};
			int[] a = new int[10+b.length];
			for(int i: new int[]{0,1,2,3,4,5,6,7,8,9}){
				a[i]=i;
			}
			
			for(int i : b){
				System.out.format("%d ", i);
			}
			System.out.println();
			for(int i : a){
				System.out.format("%d ", i);
			}
			System.out.println();
			mergeArrays(a,b,a.length-b.length-1, b.length-1);
			
			for(int i : a){
				System.out.format("%d ", i);
			}
		}
		
}
