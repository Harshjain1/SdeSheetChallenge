//TC -> O(n)
//SC -> O(n)
import java.util.*;
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
    static int idx;
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        idx = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<inorder.size();i++){
            mp.put(inorder.get(i),i);
        }
        return construct(preorder,0,preorder.size()-1,mp);
    }
    
    public static TreeNode<Integer> construct(ArrayList<Integer> pre,int st,int end,HashMap<Integer,Integer> mp){
        if(st>end){
            return null;
        }
        int val = pre.get(idx);
        idx++;
        TreeNode<Integer> root = new TreeNode(val);
        int index = mp.get(val);
        root.left = construct(pre,st,index-1,mp);
        root.right = construct(pre,index+1,end,mp);
        return root;
    }
}








