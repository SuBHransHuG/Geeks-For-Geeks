class Solution {
    public static long[] productExceptSelf(int nums[]) {
        int n = nums.length;
        long[] result = new long[n];
        long product = 1;

        for (int i = 0; i < n; i++) {
            product *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                result[i] = product / nums[i];
            } else {
                long tempProduct = 1;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        tempProduct *= nums[j];
                    }
                }
                result[i] = tempProduct;
            }
        }

        return result;
    }
}
