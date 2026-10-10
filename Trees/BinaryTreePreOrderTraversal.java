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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        preOrder(res,root);
        return res;
    }
    public void preOrder(ArrayList<Integer> res, TreeNode root){
        if(root == null) return;
        res.add(root.val);
        preOrder(res,root.left);
        preOrder(res,root.right);
    }
}