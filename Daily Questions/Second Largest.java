class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        Arrays.sort(arr);
        int second = -1;
        int x =0;
        int first = arr[n-1];
        for(int i = n-1;i>=0;i--){
            if(arr[i] < first){
                second = arr[i];
                break;
            }
        }
        return second;
    }
}
