/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int maxHeight = maxHeight(root);
        int sumOfDeepestLeaves = maxHeightSum(root, maxHeight, 0);
        
        return sumOfDeepestLeaves;
    }
    
    private int maxHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }
        
        return Math.max(maxHeight(root.left), maxHeight(root.right)) + 1;
    }
    
    private int maxHeightSum(TreeNode root, int maxHeight, int currentLevel) {
        if (root == null) {
            return 0;
        }
        
        if (currentLevel == maxHeight) {
            return root.val;
        }
        
        return maxHeightSum(root.left, maxHeight, currentLevel + 1) + maxHeightSum(root.right, maxHeight, currentLevel + 1);
    }
}
