package cake;

import util.TreeNode;

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
}
