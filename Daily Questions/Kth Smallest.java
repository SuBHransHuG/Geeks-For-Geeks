class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int n = arr.length;
        if(k>n){
            return 0;
        }
// with inbuilt function
         Arrays.sort(arr);
        // int kth = arr[k-1];
        // return kth;
// without inbuilt function
        // int temp =0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j < n-i; j++) {
        //         if(arr[j-1]>arr[j]){
        //             temp = arr[j-1];
        //             arr[j-1]= arr[j];
        //             arr[j]= temp;
        //         }
        //     }
        // }
        int kth = arr[k-1];
        return kth;
    }
}
