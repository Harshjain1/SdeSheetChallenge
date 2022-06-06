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
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            TreeNode rem = st.pop();
            res.add(rem.data);
            if(rem.right!=null){
                st.push(rem.right);
            }
            if(rem.left!=null){
                st.push(rem.left);
            }
        }
        return res;
    }
}







