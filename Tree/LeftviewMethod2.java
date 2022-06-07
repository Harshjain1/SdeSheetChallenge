//TC -> o(n)
//SC -> O(n)
/************************************************************
   Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        traverse(root,res,0);
        return res;
    }
    
    public static void traverse(TreeNode<Integer> root,ArrayList<Integer> res,int depth){
        if(root==null){
            return;
        }
        if(res.size()==depth){
            res.add(root.data);
        }
        traverse(root.left,res,depth+1);
        traverse(root.right,res,depth+1);
    }
}
