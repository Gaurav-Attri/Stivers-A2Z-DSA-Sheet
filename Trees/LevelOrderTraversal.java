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
public class LevelOrderTraversal{
    class Solution {
        // Time Complexity --> O(n)
        // Space Complexity --> O(n)
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if(root == null) return result;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                List<Integer> currentLevelList = new ArrayList<>();
                int currentLevelSize = queue.size();

                for(int i = 0; i < currentLevelSize; i++){
                    TreeNode currentNode = queue.poll();
                    currentLevelList.add(currentNode.val);

                    if(currentNode.left != null) queue.add(currentNode.left);
                    if(currentNode.right != null) queue.add(currentNode.right);
                }
                result.add(currentLevelList);
            }

            return result;
        }
    }
}