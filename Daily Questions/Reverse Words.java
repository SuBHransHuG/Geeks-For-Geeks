class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] arr = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            sb.append(arr[i]);
            if (i != 0) {
                sb.append("."); 
            }
        }
        return sb.toString();
    }
}
