package tree;

import util.TreeNode;

/**
 * 
 * @author himanshuyadav
 *
 */

public class CheckBST {

	public static boolean isBST(TreeNode root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isBST(TreeNode node, int minValue, int maxValue) {
		
		if(node == null) return true;
		
		if(node.data < minValue || node.data > maxValue) {
			return false;
		}
		return isBST(node.left, minValue, node.data) && isBST(node.right, node.data, maxValue);
	}
	
	/**
	 * Tells isBST with Inorder Traversal
	 * 
	 */
	private static TreeNode prev;
	
	public static boolean isBSTWithTreeTraversal(TreeNode root) {
		
		if(root == null) return true;
		
		if(!isBSTWithTreeTraversal(root.left)) {
			return false;
		}
		
		if(prev!=null && root.data <= prev.data) {
			return false;
		}
		
		if(!isBSTWithTreeTraversal(root.right)) {
			return false;
		}
		
		return true;
		
	}
}
