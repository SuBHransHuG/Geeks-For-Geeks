class GfG {
    public static Node quickSort(Node node) {
        if (node == null) {
            return null;
        }

        int count = 0;
        Node temp = node;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        int[] arr = new int[count];
        Node temp1 = node;
        for (int i = 0; i < count; i++) {
            arr[i] = temp1.data;
            temp1 = temp1.next;
        }

        Arrays.sort(arr);

        temp1 = node;
        for (int i = 0; i < count; i++) {
            temp1.data = arr[i];
            temp1 = temp1.next;
        }

        return node;
    }
}
