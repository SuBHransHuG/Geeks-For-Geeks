class Solution {
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m) {
        HashSet<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }
        
        ArrayList<Integer> missingElements = new ArrayList<>();
        for (int num : a) {
            if (!setB.contains(num)) {
                missingElements.add(num);
            }
        }
        
        return missingElements;
    }
}
