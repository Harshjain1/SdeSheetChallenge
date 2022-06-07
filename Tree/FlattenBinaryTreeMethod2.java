//TC -> O(n)
//SC -> O(n)
import java.util.*;
/************************************************************
    Following is the TreeNode class structure.

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/

public class Solution 
{
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        if(root==null){
            return null;
        }
        Stack<TreeNode<Integer>> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            TreeNode<Integer> rem = st.pop();
            if(rem.right!=null){
                st.push(rem.right);
            }
            if(rem.left!=null){
                st.push(rem.left);
            }
            if(!st.isEmpty()){
                rem.right = st.peek();
            }
            rem.left = null;
        }
        return root;
    }
}







