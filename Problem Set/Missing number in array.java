class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        
        
        int sum1 =0;
        int sum2 =0;
        
        for(int i=0;i<n+1;i++){
            sum1+=i;
        }
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }
        int y = sum1 - sum2;
        return y;
        
        
        }
}
