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
    public class Pair{
        int leftSlope =-1;
        int rightSlope = -1;
        int maxLen = 0;
    }
    public int longestZigZag(TreeNode root) {
        Pair ans = helper(root);
        return ans.maxLen;
    }

    public Pair helper(TreeNode root){
        if(root==null) return new Pair();

        Pair left = helper(root.left);
        Pair right = helper(root.right);

        Pair myAns = new Pair();
        myAns.maxLen = Math.max(Math.max(left.rightSlope + 1 , right.leftSlope + 1),Math.max(left.maxLen,right.maxLen));
        myAns.leftSlope = left.rightSlope+1; 
        myAns.rightSlope = right.leftSlope+1;
        return myAns;

    }
}