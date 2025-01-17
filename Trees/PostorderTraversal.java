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
public class postorderTraversal{
    class Solution {
        List<Integer> answer = new ArrayList<>();
        public List<Integer> postorderTraversal(TreeNode root) {
            postOrder(root);
            return answer;
        }

        public void postOrder(TreeNode root){
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            answer.add(root.val);
        }
    }
}