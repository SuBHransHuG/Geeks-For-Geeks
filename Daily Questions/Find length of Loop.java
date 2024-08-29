class Solution {
    
    static int countN(Node n){
        Node temp = n;
        int t =1;
        while(temp.next!=n){
            t++;
            temp = temp.next;
        }
        return t;
    }
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;
        while(slow !=null && fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return countN(slow);
            }
        }
        return 0;
    }
}
