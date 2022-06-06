//TC -> O(n)
//SC -> O(n)

import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        Stack<Integer> st = new Stack<>();
        LinkedListNode<Integer> curr = head;
        while(curr!=null){
            st.push(curr.data);
            curr = curr.next;
        }
        curr = head;
        while(st.size()>0){
            curr.data = st.pop();
            curr = curr.next;
        }
        return head;
    }
}
