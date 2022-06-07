//TC -> O(n)
//SC -> O(n)
/************************************************************
  Following is the Binary Tree node structure:   
   class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> traverseBoundary(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        res.add(root.data);
        leftside(root.left,res);
        leaf(root.left,res);
        leaf(root.right,res);
        rightside(root.right,res);
        return res;
    }
    
    public static void leftside(TreeNode node,ArrayList<Integer> res){
        if(node==null){
            return ;
        }
        if(node.left!=null){
            res.add(node.data);
            leftside(node.left,res);
        }
        else if(node.right!=null){
            res.add(node.data);
            leftside(node.right,res);
        }
    }
    
    public static void leaf(TreeNode node,ArrayList<Integer> res){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            res.add(node.data);
            return;
        }
        leaf(node.left,res);
        leaf(node.right,res);
    }
    
    public static void rightside(TreeNode node,ArrayList<Integer> res){
        if(node==null){
            return;
        }
        if(node.right!=null){
            rightside(node.right,res);
            res.add(node.data);
        }
        else if(node.left!=null){
            rightside(node.left,res);
            res.add(node.data);
        }
    }
}




