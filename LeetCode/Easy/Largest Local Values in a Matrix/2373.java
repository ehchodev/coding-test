class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = 0;

                for (int a = i; a < i + 3; a++) {
                    for (int b = j; b < j + 3; b++) {
                        max = grid[a][b] > max ? grid[a][b] : max;
                    }
                }

                maxLocal[i][j] = max;
            }
        }

        return maxLocal;
    }
}
