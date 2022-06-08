//TC -> O(n)
//SC -> O(n)
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
		HashMap<LinkedListNode<Integer>,LinkedListNode<Integer>> mp = new HashMap<>();
        LinkedListNode<Integer> curr = head;
        while(curr!=null){
            mp.put(curr,new LinkedListNode(curr.data));
            curr = curr.next;
        }
        LinkedListNode<Integer> dummy = mp.get(head);
        curr = head;
        while(curr!=null){
            dummy.next = mp.get(curr.next);
            dummy.random = mp.get(curr.random);
            curr = curr.next;
            dummy = dummy.next;
        }
        return mp.get(head);
	}
}
