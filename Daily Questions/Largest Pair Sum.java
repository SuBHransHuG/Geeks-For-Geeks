class Solution {
    public static int pairsum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1]+arr[arr.length-2];
    }
}

// TLE
// class Solution {
//     public static int pairsum(int[] arr) {
//         int n = arr.length;
//         int j = n - 1;
//         int maximum = 0;

//         for (int i = 0; i < n; i++) {
//             int s = 0;
            
            
            
//             if (i == j && i != 0 && j != 0) {
//                 i = 0; 
//                 j--;   
//             }

//             if (i == j) { 
//                 break;
//             }
//             s += arr[i] + arr[j]; 
//             maximum = Math.max(maximum, s); 
//         }

//         return maximum;
//     }
// }
