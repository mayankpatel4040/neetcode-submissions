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
    public boolean isBalanced(TreeNode root) {

         if(root == null){
            return true;
         }
        int l = maxheight(root.left);
        int r= maxheight(root.right);
        if (Math.abs(l-r)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);


    }
    public int maxheight(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = maxheight(root.left);
        int r = maxheight(root.right);
        return l>r ?l+1:r+1;

        
    }
    
}
