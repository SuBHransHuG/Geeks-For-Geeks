class Solution {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        // Your code here
        int n = arr.length;
        if(n==1){
            return 1;
        }
        long sum=0;
        long left=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            sum-=arr[i];
            if(sum==left){
                return i+1;
            }
            left+=arr[i];
        }
        return -1;
    }
}
