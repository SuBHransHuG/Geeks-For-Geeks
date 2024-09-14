class Solution {
    void rearrange(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr.get(i) >= 0) {
                al1.add(arr.get(i));
            } else {
                al2.add(arr.get(i));
            }
        }

        int i = 0, j = 0, k = 0;

        while (i < al1.size() && j < al2.size()) {
            arr.set(k++, al1.get(i++)); 
            arr.set(k++, al2.get(j++)); 
        }

        while (i < al1.size()) {
            arr.set(k++, al1.get(i++));
        }

        while (j < al2.size()) {
            arr.set(k++, al2.get(j++));
        }
    }
}
