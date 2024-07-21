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
public class inorderTraversal{
    class Solution {
        List<Integer> answer = new ArrayList<>();
        public List<Integer> inorderTraversall(TreeNode root) {
            iot(root);
            return answer;
        }

        public void iot(TreeNode root){
            if(root == null) return;
            iot(root.left);
            answer.add(root.val);
            iot(root.right);
        }
    }
}