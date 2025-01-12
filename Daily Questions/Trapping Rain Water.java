class Solution {
    public int maxWater(int arr[]) {
        // code here
        int res = 0;
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = arr[0];
        for(int i =1; i<n;i++){
            left[i] = Math.max(arr[i-1],arr[i]);
        }
        
        right[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            right[i] = Math.max(arr[i+1],arr[i]);
        }
        
        for(int i =1;i<n-1;i++){
            int min = Math.min(left[i-1],right[i+1]);
            if(min>arr[i]){
            res+=min-arr[i];
            }
        }
        return res;
    }
}
