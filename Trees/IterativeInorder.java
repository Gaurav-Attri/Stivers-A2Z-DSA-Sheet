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

public class IterativeInorder{
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            TreeNode node = root;
            Stack<TreeNode> stack = new Stack<>();

            while(!stack.isEmpty() || node != null){
                // Move to the farthest left
                while(node != null){
                    stack.push(node);
                    node = node.left;
                }

                // Add node to the result
                TreeNode top = stack.pop();
                result.add(top.val);

                // Move to the right
                node = top.right;
            }

            return result;
        }
    }
}