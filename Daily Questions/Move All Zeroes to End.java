class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n= arr.length;
        int count = 0;
        for(int i:arr){
            if(i == 0)
            count++;
        }
        int[] arr1 = new int[n-count];
        int j =0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int i =0;i<n-count;i++){
            arr[i]=arr1[i];
        }
        int t = n-count;
        while(count>0){
            arr[t] = 0;
            t++;
            count--;
        }
    }
}
