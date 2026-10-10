package Trees;
import java.util.*;
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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        postOrder(res,root);
        return res;
    }
    public void postOrder(ArrayList<Integer> res, TreeNode root){
        if(root == null) return;
        postOrder(res,root.left);
        postOrder(res,root.right);
        res.add(root.val);
    }
}
