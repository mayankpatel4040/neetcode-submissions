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
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
    Max(root);  
    return d;
    }
    public int Max(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int l= Max(root.left);
        int r= Max(root.right);
        d = Math.max(d, l+r);
        return l>r?l+1:r+1;
        
        
    }
}
