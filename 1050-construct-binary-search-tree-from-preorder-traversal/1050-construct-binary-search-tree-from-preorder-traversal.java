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
    
     static int idx;
    private static TreeNode BstFromPreorder(int[] preorder,int lr,int rr)
    {
        if(idx>=preorder.length || preorder[idx]<lr || preorder[idx]>rr)
        {
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[idx]);
        idx++;
        node.left = BstFromPreorder(preorder,lr,node.val);
        node.right = BstFromPreorder(preorder,node.val,rr);
        
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        idx = 0;
        return BstFromPreorder(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}