/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.List;
import java.util.ArrayList;
public class TreeTraversals{
    public class Solution {
        static List<Integer> inorder = new ArrayList<>();
        static List<Integer> preorder = new ArrayList<>();
        static List<Integer> postorder = new ArrayList<>();
        
        static List<List<Integer>> result = new ArrayList<>();

        // TC --> O(n)
        public static List<List<Integer>> getTreeTraversal(TreeNode root) {
            inOrder(root);
            preOrder(root);
            postOrder(root);

            result.add(inorder);
            result.add(preorder);
            result.add(postorder);

            return result;
        }

        public static void inOrder(TreeNode root){
            if(root == null) return;
            inOrder(root.left);
            inorder.add(root.data);
            inOrder(root.right);
        }

        public static void preOrder(TreeNode root){
            if(root == null) return;
            preorder.add(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void postOrder(TreeNode root){
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            postorder.add(root.data);
        }
    }
}