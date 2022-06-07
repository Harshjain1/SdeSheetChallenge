//TC -> O(n)
//SC -> recursive stack space 
/*************************************************************
Following is the Binary Tree Node structure:
    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
    static int dia;
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		dia = 0;
        traverse(root);
        return dia;
	}
    
    public static int traverse(TreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int lh = traverse(root.left);
        int rh = traverse(root.right);
        dia = Math.max(dia,lh+rh+2);
        return Math.max(lh,rh)+1;
    }
}
