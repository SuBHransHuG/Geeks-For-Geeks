class Solution {
    // Function to find two repeated elements.
    ArrayList<Integer> twoRepeated(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n + 2; i++) {
            int ind = Math.abs(arr[i]);
            if (arr[ind] > 0) {
                arr[ind] = -arr[ind];
            } else {
                ans.add(ind);
            }
        }
        return ans;
    }
}
