import java.util.*;
/*************************************************************

    Following is the Binary Tree node structure:

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;
        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

*************************************************************/

public class Solution {
    public static ArrayList<Integer> printRightView(BinaryTreeNode<Integer> root) {
       ArrayList<Integer> res = new ArrayList<>();
        traverse(root,res,0);
        return res;
    }
    
    public static void traverse(BinaryTreeNode<Integer> root,ArrayList<Integer> res,int mindepth){
        if(root==null){
            return;
        }
        if(mindepth==res.size()){
            res.add(root.data);
        }
        traverse(root.right,res,mindepth+1);
        traverse(root.left,res,mindepth+1);
    }
}
