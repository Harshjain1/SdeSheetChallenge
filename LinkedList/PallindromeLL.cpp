#include <bits/stdc++.h> 
/****************************************************************

    Following is the class structure of the LinkedListNode class:

    template <typename T>
    class LinkedListNode
    {
    public:
        T data;
        LinkedListNode<T> *next;
        LinkedListNode(T data)
        {
            this->data = data;
            this->next = NULL;
        }
    };

*****************************************************************/

bool isPalindrome(LinkedListNode<int> *head) {

   if(head==NULL || head->next==NULL)
      return true;
  LinkedListNode<int> *temp1=head;
  LinkedListNode<int> *slow=head;
  LinkedListNode<int> *fast=head->next;
  while(fast!=NULL && fast->next!=NULL){
    slow=slow->next;
    fast=fast->next->next;
  }
  LinkedListNode<int> *temp2=slow->next;
  LinkedListNode<int> *current=temp2;
  LinkedListNode<int> *prev=NULL;
  LinkedListNode<int> *p;
  while(current!=NULL){
    p=current->next;
    current->next=prev;
    prev=current;
    current=p;
  }
  temp2=prev;
  while(temp2!=NULL){
   if(temp1->data!=temp2->data)
       return false;
   temp1=temp1->next;
   temp2=temp2->next;
   }
   return true;
}
