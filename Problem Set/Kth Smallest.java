class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        int m = arr[k-1];
        return m;
    } 
}
