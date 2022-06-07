//TC -> O(n+m)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
/****************************************************************
    Following is the class structure of the Node class:
    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }
*****************************************************************/

public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode dummy = new LinkedListNode(-1);
        LinkedListNode prev = dummy;
        LinkedListNode curr1 = head1;
        LinkedListNode curr2 = head2;
        int carry = 0;
        while(curr1!=null || curr2!=null || carry!=0){
            int sum = 0;
            if(curr1!=null){
                sum += curr1.data;
                curr1 = curr1.next;
            }
            if(curr2!=null){
                sum += curr2.data;
                curr2 = curr2.next;
            }
            sum += carry;
            LinkedListNode temp = new LinkedListNode(sum%10);
            carry = sum/10;
            prev.next = temp;
            prev = temp;
        }
        return dummy.next;
    }
}
