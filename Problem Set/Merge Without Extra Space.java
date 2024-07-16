class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here
        int i =0;
        int j =0;
        int k =0;
        long[] arr3 = new long[n+m];
        while(i<n){
            arr3[k++] = arr1[i++];
        }
        while(j<m){
            arr3[k++] = arr2[j++];
        }
        Arrays.sort(arr3);
        int x = 0;
        int y = 0;
        int z = 0;
        while(x<n){
            arr1[x++] = arr3[z++];
        }
        while(y<m){
            arr2[y++] = arr3[z++];
        }
    }
}
