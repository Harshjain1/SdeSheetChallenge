//TC -> O(n)+O(n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        Node curr = head;
        int count = 0;
        while(curr!=null){
            curr = curr.next;
            count++;
        }
        curr = head;
        for(int i=0;i<count/2;i++){
            curr = curr.next;
        }
        return curr;
    }
}

