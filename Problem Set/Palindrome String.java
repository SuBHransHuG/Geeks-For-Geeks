class Solution {
    int isPalindrome(String S) {
        // code here
        char[] arr = S.toCharArray();
        int n = arr.length;
        int j = n-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j]){
                return 0;
            }
            j--;
        }
        return 1;
    }
};
