package tree;

import util.TreeNode;

public class BalancedTree {
	
	public static boolean isBalanced(TreeNode root) {
		if(root == null) return true;
		
		return Math.max(getHeight(root.left),getHeight(root.right)) > 1;
	}

	private static int getHeight(TreeNode node) {
		
		if(node == null) return 0;
		 
		return Math.abs(getHeight(node.left) - getHeight(node.right)) +1;
	}

}
