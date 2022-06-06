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
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(true){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                curr = st.pop();
                res.add(curr.data);
                curr = curr.right;
            }
        }
    	return res;
    }
}
