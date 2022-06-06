//TC -> O(n)
//SC -> O(n)
import java.util.*;
/*
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
        traverse(root,res);
        return res;
    }
    
    public static void traverse(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        traverse(root.left,res);
        res.add(root.data);
        traverse(root.right,res);
    }
}















