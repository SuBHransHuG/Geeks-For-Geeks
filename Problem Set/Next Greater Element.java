class Solution {
    public static long[] nextLargerElement(long[] arr, int n) { 
        
        long[] result = new long[n];
        
        Stack<Long> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            
            stack.push(arr[i]);
        }
        
        return result;
    }
}
