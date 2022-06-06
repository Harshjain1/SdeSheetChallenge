//TC -> O(n)
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
import java.util.*;
public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode<Integer>> qu = new LinkedList<>();
        qu.add(root);
        while(qu.size()>0){
            int count = qu.size();
            for(int i=0;i<count;i++){
                TreeNode<Integer> rem = qu.remove();
                if(i==0){
                    res.add(rem.data);
                }
                if(rem.left!=null){
                    qu.add(rem.left);
                }
                if(rem.right!=null){
                    qu.add(rem.right);
                }
            }
        }
        return res;
    }
}
