package javaInterviewQuestions;

import java.util.LinkedList;

//Given a sorted (increasing order) array with unique integer elements,
//write an algoritm to create a binary search tree with minimal heigth.
public class MinimalTree {
	public TreeNode createMinimalBST(int arr[]) {

		return createMinimalBST(arr, 0, arr.length - 1);
	}

	public TreeNode createMinimalBST(int arr[], int start, int end) {
		if (end < start)
			return null;

		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createMinimalBST(arr, start, mid - 1);
		n.right = createMinimalBST(arr, mid + 1, end);
		return n;

	}

	class TreeNode {

		public TreeNode left, right;
		int data;

		public TreeNode() {
		}

		public TreeNode(int data) {
			this.data = data;
		}
	}
}
