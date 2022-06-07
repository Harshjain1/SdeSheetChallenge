//TC -> O(n)
//SC -> recursion space as we have in postorder traversal
import java.util.*;
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
    static class pair{
        boolean isbal;
        int ht;
        
        pair(boolean isbal,int ht){
            this.isbal = isbal;
            this.ht = ht;
        }
    }
    
	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		pair res = traverse(root);
        return res.isbal;
	}
    
    public static pair traverse(BinaryTreeNode<Integer> root){
        if(root==null){
            return new pair(true,0);
        }
        pair lres = traverse(root.left);
        pair rres = traverse(root.right);
        pair mres = new pair(true,0);
        mres.ht = Math.max(lres.ht,rres.ht)+1;
        boolean factor = Math.abs(lres.ht-rres.ht)>1?false:true;
        mres.isbal = lres.isbal&&rres.isbal&&factor;
        return mres;
    }
}









