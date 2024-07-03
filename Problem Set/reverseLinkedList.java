//function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node prev = null;
        Node forward = null;
        Node current = head;
        while(current != null){
            forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
        }
        head = prev;
        return head;
        
    }
}
