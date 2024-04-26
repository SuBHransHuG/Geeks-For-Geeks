class Solution {
        public int[] FindExitPoint(int n, int m, int[][] matrix) {
    int i = 0, j = 0;
    int dir = 0;

    while (true) {
        dir = (dir + matrix[i][j]) % 4;

        if (matrix[i][j] == 1) {
            matrix[i][j] = 0;
        }
        if (dir == 0) {
            j++;
        }
        else if (dir == 1) {
            i++;
        }
        else if (dir == 2) {
            j--;
        }
        else if (dir == 3) {
            i--;
        }

        if (i < 0) {
            i++;
            break;
        } else if (i == n) {
            i--;
            break;
        } else if (j < 0) {
            j++;
            break;
        } else if (j == m) {
            j--;
            break;
        }
    }

    int[] v = new int[]{i, j};
    return v;
        }
}
