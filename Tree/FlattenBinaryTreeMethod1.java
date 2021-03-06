//TC -> O(n)
//SC -> O(n)
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
    static TreeNode<Integer> prev;
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        prev = null;
        flatten(root);
        return root;
    }
    
    public static void flatten(TreeNode<Integer> root){
        if(root==null){
            return ;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}










