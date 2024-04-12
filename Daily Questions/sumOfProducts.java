class Solution {
    static long pairAndSum(int n, long arr[]) {
        // code here
         long ans = 0; 
 
        for (int i = 0; i < 32; i++) {
            
            long k = 0;
            for(long j : arr){
                if((j&(1L<<i))!=0){
                    k++;
                }
            }
            ans+=k*(k-1)/2*(1L<<i);
        }
        return ans;
    }
    
}
