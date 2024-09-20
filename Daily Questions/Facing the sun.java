class Solution {
    public int countBuildings(int[] height) {
        int n = height.length;
        if (n == 0) return 0; 
        
        int count = 1; 
        int maxHeight = height[0]; 

        for (int i = 1; i < n; i++) {
            if (height[i] > maxHeight) {
                count++;
                maxHeight = height[i]; 
            }
        }

        return count;
    }
}
