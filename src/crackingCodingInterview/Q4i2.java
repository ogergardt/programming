package crackingCodingInterview;


public class Q4i2 {
	//Given a sorted (increasing order) array with unique integer elements, 
	//write an algorithm to create a binary search tree with minimal height. p.109, p.242
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		TreeNode root = createMinimalBST(arr);
		printTree(root);
	}
	
	public static TreeNode createMinimalBST(int arr[]){

		return createMinimalBST(arr, 0, arr.length-1);
	}
	
	public static TreeNode createMinimalBST(int[] arr, int start, int end){
		
		if(end < start) return null;
		int mid = start + (end-start) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createMinimalBST(arr, start, mid-1);
		n.right = createMinimalBST(arr, mid+1, end);
		
		return n;
		
	}
	
	private static void printTree(TreeNode root){
		if(root==null) return;
		System.out.format("\n %d : ",root.value );
		if(root.left!=null) {
			System.out.format("l%d ",root.left.value );
		}
		if(root.right!=null) {
			System.out.format("r%d ",root.right.value );
		}
		printTree(root.left);
		printTree(root.right);
		
	}
	
	
	private static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int value){
			this.value=value;
		}
	}
		
}
	
	

