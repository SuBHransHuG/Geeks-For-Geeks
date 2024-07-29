class Solution {
    public int rowWithMax1s(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int max1sRowIndex = -1;
        int maxCount = 0;

        for(int i = 0; i < row; i++) {
            int count = 0;  
            for(int j = 0; j < col; j++) {
                if(arr[i][j] == 1) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                max1sRowIndex = i;
            }
        }

        return max1sRowIndex;
    }
}
