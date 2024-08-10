class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        Node oldTail = head;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            length++;
        }

        oldTail.next = head;
        k = k % length;
        int stepsToNewHead = length - k;
        Node newTail = head;
        for (int i = 0; i < stepsToNewHead - 1; i++) {
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
