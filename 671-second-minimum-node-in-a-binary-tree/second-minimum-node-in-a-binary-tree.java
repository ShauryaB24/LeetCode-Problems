/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int helper(TreeNode root, int curr){
        if(root == null)return -1;

        if(root.val > curr)return root.val;
        
        int left = helper(root.left,curr);
        int right = helper(root.right,curr);

        if (left == -1 && right == -1) return -1;
        if (left == -1) return right;
        if (right == -1) return left;
        return Math.min(left, right);        

    }

    public int findSecondMinimumValue(TreeNode root) {
        int ans = helper(root,root.val);
        return ans;
    }
}