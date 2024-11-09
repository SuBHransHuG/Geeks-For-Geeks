class Solution {
    public int reducingWalls(int[] arr, int k) {
        // code
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k)
            count+=(arr[i]-1)/k;
        }
        return count;
    }
}
