//TC -> O(1)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
/****************************************************************
    Following is the class structure of the LinkedListNode class:
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Solution {
	public static void deleteNode(LinkedListNode<Integer> node) {
        LinkedListNode<Integer> temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
        return;
	}
}







