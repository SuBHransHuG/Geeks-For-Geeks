class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {
        // Your code here
        int n = arr.length;
        int max =Integer.MIN_VALUE;
        int sum=0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
