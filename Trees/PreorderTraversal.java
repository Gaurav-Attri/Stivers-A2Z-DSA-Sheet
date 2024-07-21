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
public class preorderTraversal{
    class Solution {
        List<Integer> answer = new ArrayList<>();
        public List<Integer> preorderTraversall(TreeNode root) {
            preorder(root);
            return answer;
        }

        public void preorder(TreeNode root){
            if(root == null) return;
            answer.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
}