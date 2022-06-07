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
    static class pair{
        int ht;
        int dia;
        pair(int ht,int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }
    
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		pair res = traverse(root);
        return res.dia;
	}
    
    public static pair traverse(TreeNode<Integer> root){
        if(root==null){
            return new pair(-1,0);
        }
        pair lres = traverse(root.left);
        pair rres = traverse(root.right);
        pair mres = new pair(-1,0);
        mres.ht = Math.max(lres.ht,rres.ht)+1;
        mres.dia = Math.max(lres.ht+rres.ht+2,Math.max(lres.dia,rres.dia));
        return mres;
    }
}










