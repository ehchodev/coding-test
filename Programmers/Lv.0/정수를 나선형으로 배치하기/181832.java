class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int l = 1; // 반복횟수
        int d = 1; // 방향 (1: 오른쪽, 2: 아래, 3: 왼쪽, 4: 위)
        
        int i = 0, j = 0;
        for (int num=1; num<=n*n; num++) {
            answer[i][j] = num;
            
            if (d == 1) {
                if (j < n - l) {
                    j++;
                } else {
                    i++;
                    d++;
                }
            } else if (d == 2) {
                if (i < n - l) {
                    i++;
                } else {
                    j--;
                    d++;
                }
            } else if (d == 3) {
                if (j >= l) {
                    j--;
                } else {
                    i--;
                    d++;
                }
            } else if (d == 4) {
                if (i > l) {
                    i--;
                } else {
                    j++;
                    l++;
                    d = 1;
                }
            }
            
        }
        
        return answer;
    }
}
