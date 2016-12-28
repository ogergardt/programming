package crackingCodingInterview;

public class MergeSort {
	
	//Implementation of Merge Sort. RuntimeO(n log(n)) average and worst case. Memory: Depends
	//p.146

	public void mergeSort(int[] arr){
		//create a new array
		int[] helpArr = new int[arr.length];
		mergeSort(arr, helpArr, 0, arr.length-1);
	}
	
	private void mergeSort(int[] arr, int[] helpArr, int low, int hight){
		if(low<hight){
			int middle = low+(hight-low)/2;
			mergeSort(arr, helpArr, low, middle);
			mergeSort(arr, helpArr, middle+1, hight);
			merge(arr, helpArr, low, middle, hight);
		}
	}
	private void merge(int[] arr, int[] helpArr, int low, int middle, int hight){
		//copy both halves to helpArr
		for(int i=0; i<=hight; i++){
			helpArr[i]=arr[i];
		}
		
		int helpLeft = low;
		int helpRight = middle+1;
		int current = low;
		
		//Iterate throught helpArr. Compare left and right half and copy to arr the smaller element 
		while(helpLeft<=middle && helpRight<=hight){
			if(helpArr[helpLeft] <= helpArr[helpRight]){
				arr[current] = helpArr[helpLeft];
				helpLeft++;
			} else {
				arr[current] = helpArr[helpRight];
				helpRight++;
			}
			current++;
		}
		
		//copy the rest of left half to arr
		int remaining = middle - helpLeft;
		for(int i=0; i<=remaining; i++){
			arr[current+i] = helpArr[helpLeft+i]; 
		}
		
	}
		
	
	
	public static void main(String[] args){
		int[] arr = {4,5,1,2,3};
		for(int i : arr) System.out.print(i+" ");
	
		MergeSort sort = new MergeSort();
		sort.mergeSort(arr);
		System.out.println();
		for(int i : arr) System.out.print(i+" ");

	}
}
