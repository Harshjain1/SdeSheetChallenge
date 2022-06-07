//TC -> O(n)
//SC -> O(n)
import java.util.*;
/*  Following is the class used to represent the object/node of the Binary Tree
	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/

public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<BinaryTreeNode<Integer>> st1 = new Stack<>();
        Stack<BinaryTreeNode<Integer>> st2 = new Stack<>();
        st1.push(root);
        while(st1.size()>0 || st2.size()>0){
            while(st1.size()>0){
                BinaryTreeNode<Integer> rem = st1.pop();
                res.add(rem.data);
                if(rem.left!=null){
                    st2.push(rem.left);
                }
                if(rem.right!=null){
                    st2.push(rem.right);
                }
            }
            while(st2.size()>0){
                BinaryTreeNode<Integer> rem = st2.pop();
                res.add(rem.data);
                if(rem.right!=null){
                    st1.push(rem.right);
                }
                if(rem.left!=null){
                    st1.push(rem.left);
                }
            }
        }
        return res;
	}
}





