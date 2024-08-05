class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
           d = d % n;
        
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
        
        
    }
}
