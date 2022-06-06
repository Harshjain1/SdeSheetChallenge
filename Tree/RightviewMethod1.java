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
        if(root==null){
            return res;
        }
        Queue<BinaryTreeNode<Integer>> qu = new LinkedList<>();
        qu.add(root);
        while(qu.size()>0){
            int count = qu.size();
            for(int i=0;i<count;i++){
                BinaryTreeNode<Integer> rem = qu.remove();
                if(i==count-1){
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
