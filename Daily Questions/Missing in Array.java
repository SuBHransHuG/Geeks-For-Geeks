class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int m = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<m;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return m+1;
    }
}
