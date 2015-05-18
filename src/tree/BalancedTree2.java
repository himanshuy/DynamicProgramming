package tree;

import util.TreeNode;

public class BalancedTree2 {
	
	public static int checkHeight(TreeNode root) {
		if(root == null) return 0;
		
		// If left is balanced.
		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1) {
			return -1;
		}
		
		// right is balanced.
		int rightHeight = checkHeight(root.right);
		if(rightHeight == -1) {
			return -1;
		}
		
		// current node is balanced.
		int diff = leftHeight - rightHeight;
		if(Math.abs(diff) > 1) {
			return -1; //not balanced
		} else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
	
	public static boolean isBalanced(TreeNode root) {
		if(checkHeight(root) == -1) {
			return false;
		} else {
			return true;
		}
	}

}
