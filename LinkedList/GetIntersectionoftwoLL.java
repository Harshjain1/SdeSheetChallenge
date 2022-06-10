//TC -> O(m+n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Solution {

	public static int findIntersection(LinkedListNode<Integer> first, LinkedListNode<Integer> second){
		if(first==null || second==null){
            return -1;
        }
        LinkedListNode<Integer> curr = first;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = first;
        LinkedListNode<Integer> res = getIntersection(second);
        curr.next = null;
        return res==null?-1:res.data;
	}
    
    public static LinkedListNode<Integer> getIntersection(LinkedListNode<Integer> head){
        if(head==null || head.next==null){
            return null;
        }
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow!=fast){
            return null;
        }
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}









