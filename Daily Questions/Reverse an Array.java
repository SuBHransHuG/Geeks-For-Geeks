class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int[] a = new int[n];
        int j =0;
        for(int i = n-1; i>=0;i--){
           a[i] = arr[j];
           j++;
        }
        for(int i =0;i<n;i++ ){
            arr[i] = a[i];
        }
    }
}
