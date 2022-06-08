//TC -> O(n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the LinkedListNode class structure
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode<T> random;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*************************************************************/

public class Solution {
    public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
        if(head==null){
            return null;
        }
        LinkedListNode<Integer> curr = head;
        while(curr!=null){
            LinkedListNode<Integer> next = curr.next;
            curr.next = new LinkedListNode(curr.data);
            curr.next.next = next;
            curr = next;
        }
        for(curr=head;curr!=null;curr=curr.next.next){
            curr.next.random = curr.random!=null?curr.random.next:null;
        }
        LinkedListNode<Integer> nhead = head.next;
        LinkedListNode<Integer> copy = head.next;
        LinkedListNode<Integer> original = head;
        while(original!=null || copy!=null){
            original.next = original.next!=null?original.next.next:null;
            copy.next = copy.next!=null?copy.next.next:null;
            original = original.next;
            copy = copy.next;
        }
        return nhead;
    }
}








