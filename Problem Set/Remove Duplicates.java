class Solution {
    String removeDups(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (!hashSet.contains(arr[i])) {
                hashSet.add(arr[i]);
                result.append(arr[i]);
            }
        }
        
        return result.toString();
    }
}
