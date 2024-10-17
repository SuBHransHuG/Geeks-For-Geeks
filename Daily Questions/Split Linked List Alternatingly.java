class Solution {
    Node[] alternatingSplitList(Node head) {
        if (head == null) {
            return new Node[] {null, null};
        }

        LinkedList<Node> li1 = new LinkedList<>();
        LinkedList<Node> li2 = new LinkedList<>();

        Node temp = head;
        boolean toggle = true;
        
        while (temp != null) {
            if (toggle) {
                li1.add(temp);
            } else {
                li2.add(temp);
            }
            toggle = !toggle;
            temp = temp.next;
        }

        for (int i = 0; i < li1.size() - 1; i++) {
            li1.get(i).next = li1.get(i + 1);
        }
        if (!li1.isEmpty()) {
            li1.getLast().next = null;
        }

        for (int i = 0; i < li2.size() - 1; i++) {
            li2.get(i).next = li2.get(i + 1);
        }
        if (!li2.isEmpty()) {
            li2.getLast().next = null;
        }

        Node[] result = new Node[2];
        result[0] = li1.isEmpty() ? null : li1.getFirst();
        result[1] = li2.isEmpty() ? null : li2.getFirst();

        return result;
    }
}
