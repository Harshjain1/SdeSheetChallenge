//TC -> O(n)
//SC -> recursion space as we use in postorder
/*************************************************************
Following is the Binary Tree node structure
class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {
	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		int res = traverse(root);
        return res==-1?false:true;
	}
    
    public static int traverse(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int lh = traverse(root.left);
        if(lh==-1){
            return -1;
        }
        int rh = traverse(root.right);
        if(rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return 1+Math.max(lh,rh);
    }
}











