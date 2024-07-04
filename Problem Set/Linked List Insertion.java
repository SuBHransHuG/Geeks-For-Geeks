/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
         Node n1=new Node(x);
        if(head==null){
           head=n1;
           return head;
       }
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=n1;
       return head;
    }
}
