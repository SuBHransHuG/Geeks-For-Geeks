class Solution {
    public boolean canSplit(int arr[]) {
        int n = arr.length;
        int j = n - 1;
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        
        while (i <= j) {
            if (sum1 <= sum2) {
                sum1 += arr[i];
                i++;
            } else {
                sum2 += arr[j];
                j--;
            }
            
            if (sum1 == sum2 && i > j) {
                return true;
            }
        }
        
        return false;
    }
}
