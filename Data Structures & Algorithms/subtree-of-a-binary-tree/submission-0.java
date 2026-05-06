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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(isEqual(root,subRoot) || subRoot==null){
            return true;
        }
        if(root==null){
           return false;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);


    }
    public boolean isEqual(TreeNode r , TreeNode s){
        if(r== null && s == null){
            return true;
        }
        else if(r==null || s==null){
            return false;
        }
        return r.val==s.val && isEqual(r.left,s.left) && isEqual(r.right,s.right);
        
    }

}
