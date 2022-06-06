//TC -> O(n+m)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		if(first==null){
            return second;
        }
        if(second==null){
            return first;
        }
        LinkedListNode<Integer> dummy = new LinkedListNode(-1);
        LinkedListNode<Integer> prev = dummy;
        LinkedListNode<Integer> curr1 = first;
        LinkedListNode<Integer> curr2 = second;
        while(curr1!=null && curr2!=null){
            if(curr1.data<curr2.data){
                prev.next = curr1;
                curr1 = curr1.next;
                prev = prev.next;
            }
            else{
                prev.next = curr2;
                curr2 = curr2.next;
                prev = prev.next;
            }
        }
        if(curr1!=null){
            prev.next = curr1;
        }
        if(curr2!=null){
            prev.next = curr2;
        }
        return dummy.next;
	}
}
