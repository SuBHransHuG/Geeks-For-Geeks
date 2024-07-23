class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        
        int n = arr.length;
        ArrayList<Integer> aL = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1] && arr[i+1]!=0){
                arr[i]=2*arr[i];
                arr[i+1]=0;
            }
        }
         int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }
        for(int i:result){
            aL.add(i);
        }
        return aL;
    }
}
 
